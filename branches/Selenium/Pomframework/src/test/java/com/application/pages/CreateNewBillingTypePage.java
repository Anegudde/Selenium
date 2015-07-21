package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewBillingTypePage {

	WebDriver driver;
	public CreateNewBillingTypePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="name")
	private WebElement nameTextbox;
	
	@FindBy(css="input[type='submit']")
	private WebElement createButton;
	
	public void createBilling(String billingName){
		nameTextbox.sendKeys(billingName);
		createButton.click();
	}

}





