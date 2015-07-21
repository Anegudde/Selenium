Test Instructions:
http://www.tutorialspoint.com/selenium/selenium_grids.htm
------------------------------------------------------------------------------------------------
Grid Server:
java -jar selenium-server-standalone-2.39.0.jar -port 4444 -role hub -nodeTimeout 1000 –hubConfig C:\Users\vikram.uk\workspace\SeleniumGrid\grid_node.json
------------------------------------------------------------------------------------------------
IE Browser: Port 5558
java -jar C:\Users\vikram.uk\workspace\drivers\selenium-server-standalone-2.39.0.jar -role webdriver -hub http://10.117.61.30:4444/grid/register -browser browserName=ie,platform=VISTA -port 5558 -Dwebdriver.ie.driver=C:\Users\vikram.uk\workspace\drivers\IEDriverServer.exe 
C:\Users\vikram.uk\workspace\Drivers>
java -jar C:\Users\vikram.uk\workspace\drivers\selenium-server-standalone-2.39.0.jar -role node  -hub http://10.117.61.30:4444/grid/register -browser browserName=ie,platform=VISTA -port 5558 -Dwebdriver.ie.driver=C:\Users\vikram.uk\workspace\drivers\IEDriverServer.exe


Chrome Browser: Port 5557
java -jar C:\Users\vikram.uk\workspace\drivers\selenium-server-standalone-2.39.0.jar -role webdriver -hub  http://10.117.61.30:4444/grid/register -browser browserName=chrome,platform=VISTA -port 5557 -Dwebdriver.chrome.driver=C:\Users\vikram.uk\workspace\drivers\chromedriver.exe
C:\Users\vikram.uk\workspace\Drivers>
java -jar C:\Users\vikram.uk\workspace\drivers\selenium-server-standalone-2.39.0.jar -role webdriver -hub  http://10.117.61.30:4444/grid/register -browser browserName=chrome,platform=VISTA -port 5557 -Dwebdriver.chrome.driver=C:\Users\vikram.uk\workspace\drivers\chromedriver.exe


Firefox Browser: Port 5555
java -jar C:\Users\vikram.uk\workspace\drivers\selenium-server-standalone-2.39.0.jar -role webdriver -hub http://10.117.61.30:4444/grid/register -browser browserName=firefox,platform=VISTA -port 5555
C:\Users\vikram.uk\workspace\Drivers>
java -jar C:\Users\vikram.uk\workspace\drivers\selenium-server-standalone-2.39.0.jar -role webdriver -hub http://10.117.61.30:4444/grid/register -browser browserName=firefox,platform=VISTA -port 5555
------------------------------------------------------------------------------------------------

 10.117.61.30