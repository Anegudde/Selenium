package com.application.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.application.libraries.ExcelLibrary;

public class BaseClass {
	WebDriver driver;
	ExcelLibrary xllib;
	@BeforeClass
	public void launch(){
		xllib = new ExcelLibrary();
		String browser = xllib.getExcelData("Config",1,0);
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "browserdrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "browserdrivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}
	
}
