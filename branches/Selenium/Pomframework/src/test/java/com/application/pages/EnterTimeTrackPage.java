package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends BasePage{

	WebDriver driver;
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
}





