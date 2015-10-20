from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Firefox()
#driver.get("http://plnkr.co/")
driver.get("http://run.plnkr.co/plunks/kGUhDM/")
#assert "Python" in driver.title
elem = driver.find_elements_by_xpath("/html/body/div[1]/table/tbody/tr[4]/td/input[1]")
screen = driver.get_screenshot_as_file("D:\ProgApps\Wing IDE Personal 5.1.5\Work\Test.png")
print "Value Found"
#elem.send_keys("pycon")
#elem.send_keys(Keys.RETURN)
#assert "No results found." not in driver.page_source
driver.close()
