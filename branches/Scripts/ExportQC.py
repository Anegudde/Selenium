import win32com, win32com.client

import HTMLParser
class MLStripper(HTMLParser.HTMLParser):
    def __init__(self):
        self.reset()
        self.fed = []


    def handle_data(self, d):
        self.fed.append(d)


    def get_fed_data(self):
        return ''.join(self.fed)


def sanitize(data):
    s = MLStripper()
    s.feed(data)
    return s.get_fed_data()


def recursiveExport(f, qc, node):
    if not node:
        return
    f.write('%s, %s\n' %(node.Name,sanitize(node.Description)))
    print node.Name

    if node.Count <= 0:
        # Node has only test cases
        tests = node.FindTests('')
        if not tests:
            # FindTests returns None if there are no test cases
            tests = []

        for test in tests:
            designStepFactory = test.DesignStepFactory
            f.write(',%s,%s\n' %(test.ID, test.Name))
            print test.ID, test.Name

            # print out the "Design Step" for each test case
            for ds in designStepFactory.NewList(''):
                StepDescription = sanitize(ds.StepDescription)
                StepName = sanitize(ds.StepName)
                StepExpectedResult = sanitize(ds.StepExpectedResult)
                f.write(',,,,%s,%s,%s\n' %(StepName, StepDescription, StepExpectedResult))
            f.flush()

    # current node has more children
    elif node.Count > 0:
        for child in node.NewList():

            if child:
                recursiveExport(f, qc, child)
                f.write('\n')


def exportTests(qc, nodePath):
    f = open(r'export.csv','w')
    f.write(',ID, TEST NAME, ,,Step, Description, Expected Result\n')

    mg = qc.TreeManager
    node = mg.NodeByPath(nodePath)
    recursiveExport(f, qc, node)
    f.close()


if __name__ == "__main__":
    print 'Logging in...'
    qc = win32com.client.Dispatch("TDApiOle80.TDConnection")
    qc.InitConnection("http://qc:8080/qcbin")
    qc.Login("<username>", "<password>")
    qc.Connect("<domain>", "<project?")

    """
    Change nodePath to another "folder" in the Test Plan section of QC and run script
    """
    exportTests(qc, nodePath='Subject\\Some Folder')
