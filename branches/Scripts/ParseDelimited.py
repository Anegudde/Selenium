import glob
import re
import string
import csv
files = glob.glob("object_xref*.html")

objects = []

for i in files:
   fileE = open(i, "r")
   input = fileE.readlines()
   fileE.close()
   
   parse = 0
   name = ""
   for j in input:
      #find the closing point
      if (re.search("</pre>", j) != None):
         parse = 0
      #find the openning point
      if (re.search("<pre>", j) != None):
         parse = 1
      else:
         #parse the data
         if (parse == 1):
            #make sure we are not on a blank line
            if (re.search("^\r\n", j) == None):
               #are we starting a new variable?
               if ((re.search("^[^ ]", j) != None)):
                  j = re.sub("<[^>]+>", "", j)
                  j = re.sub("[ ]+", " ", j)
                  j = re.sub("[\r\n]+", "", j)
                  name = j[:j.find(" ")]
                  type = j[j.find(" ")+1:]
                  objects.append([name,type,[]])
               #are we looking at the variable type?
               elif (re.search("  Declared", j) != None):
                  if (re.search(" const ", j) != None):
                     objects[len(objects)-1][1] = "Constant %s" % (objects[len(objects)-1][1])
               #are we appending to the current variable
               elif (re.search("^    ", j) != None):                  
                  j = re.sub("<[^>]+>", "", j)
                  j = re.sub("(,\s+)", "[", j)    
                  j = re.sub("(\]\s+)", "[", j) 				  
                  j = re.sub("[ ]+", " ", j)
                  j = re.sub("[\r\n]+", "", j)
                  objects[len(objects)-1][2].append(j)
                  
      

#delete repeats
for i in range(0, len(objects)):
   #cleanup the string
   objects[i][0] = string.strip(objects[i][0])
   objects[i][1] = string.strip(objects[i][1])
   #strip off the parentheses
   objects[i][1] = re.sub("[\(\)]","",objects[i][1])
   #temp holding area
   temp = {}
   j = 0
   #parse all uses of this object
   while (j < len(objects[i][2])):
      #have we seen this before?
      if (temp.has_key(objects[i][2][j])):
         #delete the object
         del objects[i][2][j]
      #we have not seen this before
      else:
         temp[objects[i][2][j]] = 0
         #cleanup the reference
         k = string.split(objects[i][2][j], "[")
         k[0] = string.strip(k[0])
         k[1] = string.strip(k[1])
         objects[i][2][j] = k
         j += 1


unused = [[],[],[]] #global, local, parameter
fileC = file("objects.csv", 'wb')
fileCSV = csv.writer(fileC, dialect='excel')
fileCSV.writerows([["Element Name","Element Type","Reference File","Set","Use","Not Set Not Used","Set But Not Used","Used But Not Set","Multiple Set","Multiple Use"]])
#parse the objects
for i in objects:
   #if it is unknown it must belong to CEI so do not reference
   if ((re.search("Unknown", i[1]) == None) and (re.search("Enumerator", i[1]) == None)):      
      #assume the worst
      valid = 0
      rowDetails = []
      rowDetails.append(i[0])
      rowDetails.append(i[1])
      referencedFiles = ""
      useDetails = ""
      setDetails = ""
      numberofuse = 0
      numberofset = 0
      writeInFile = False
      for j in i[2]: 
         writeInFile = True
         #write the results
         #file.write("%s,%s,%s,%s\n" % (i[0], i[1], j[0], j[1]))
         #see if we use this type correctly
         #is it a parameter?
         if (re.search("Parameter", i[1]) != None):
            #did we use, deref set, or return?
            if ((re.search("Use", j[0]) != None) or (re.search("Deref Set", j[0]) != None) or (re.search("Return", j[0]) != None)):
               valid = 3
               useDetails = useDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3]+ "\t"
               numberofuse = numberofuse + 1
         elif (re.search("Local Object", i[1]) != None):
            #was the variable set?
            if ((re.search("Set", j[0]) != None) or (re.search("Init", j[0]) != None)):
               valid |= 1
               setDetails = setDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3]+ "\t"
               numberofset = numberofset + 1
            #was the variable used?
            if ((re.search("Use", j[0]) != None) or (re.search("Return", j[0]) != None)):
               valid |= 2
               useDetails = useDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3]+ "\t"
               numberofuse = numberofuse + 1
         elif (re.search("Global Object", i[1]) != None):
            if ((re.search("Set", j[0]) != None) or (re.search("Init", j[0]) != None)):
               valid |= 1
               setDetails = setDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3]+ "\t"
               numberofset = numberofset + 1
            if ((re.search("Use", j[0]) != None) or (re.search("Return", j[0]) != None)):
               valid |= 2
               useDetails = useDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3]+ "\t"
               numberofuse = numberofuse + 1
         elif (re.search("Public Object", i[1]) != None):
            if ((re.search("Set", j[0]) != None) or (re.search("Init", j[0]) != None)):
               valid |= 1
               setDetails = setDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3]+ "\t"
               numberofset = numberofset + 1
            if ((re.search("Use", j[0]) != None) or (re.search("Call", j[0]) != None)):
               valid |= 2
               useDetails = useDetails + "\t" + j[1] + "-" + j[2]+ ":" + j[3] + "\t"
               numberofuse = numberofuse + 1
         if (re.search("Define", j[0]) != None):
               referencedFiles = referencedFiles + "\t" + j[1] + "-" + j[2]+ ":" + j[3] + "\t"
      #did the worst occur?
      referencedFiles = referencedFiles.replace("\t","",1)
      setDetails = setDetails.replace("\t","",1)
      useDetails = useDetails.replace("\t","",1)	  
      rowDetails.append(referencedFiles)
      rowDetails.append(setDetails)
      rowDetails.append(useDetails)
      if (valid == 0):
         rowDetails.append("YES")
      else:
         rowDetails.append("NO")
      if (valid == 1):
         rowDetails.append("YES")
      else:
         rowDetails.append("NO")
      if (valid == 2):
         rowDetails.append("YES")
      else:
         rowDetails.append("NO")
     
      if(numberofset > 1):
         rowDetails.append("YES")
      else:
         rowDetails.append("NO")
      if(numberofuse > 1):
         rowDetails.append("YES")
      else:
         rowDetails.append("NO")
      if writeInFile:
         fileCSV.writerows([rowDetails])
fileC.close()
#issues.close()


##########################################################################
'''functions = []
files = glob.glob("invocation*.html")

for i in files:
   file = open(i, "r")
   input = file.readlines()
   file.close()
   
   for j in input:
      #find the closing point
      if (re.search("</pre>", j) != None):
         parse = 0
      #find the openning point
      if (re.search("<pre>", j) != None):
         parse = 1
      else:
         #parse the data
         if (parse == 1):
            #make sure we are not on a blank line
            if (re.search("^\r\n", j) == None):
               #are we starting a new variable?
               if ((re.search("^[^ ]", j) != None)):
                  j = re.sub("<[^>]+>", "", j)
                  j = re.sub("[ ]+", " ", j)
                  j = re.sub("[\r\n]+", "", j)
                  #is this a top level function
                  if (re.search("^\|", j) == None):
                     functions.append([j, []])
                  #is it a called function
                  else:
                     functions[len(functions)-1][1].append(j[2:])

#delete functions that do not make function calls
i = 0
while (i < len(functions)):
   if (len(functions[i][1]) == 0):
      del functions[i]
   else:
      i += 1
      
file = open("functions.csv", "w")
file.write("Function,Function Called,Parameters Sent,Parameters Expected\n")

for i in functions:
   for j in i[1]:
      file.write("%s,%s\n" % (i[0], j))

file.close()'''

   


