package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingTypesPage extends BasePage{

	WebDriver driver;
	public BillingTypesPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="ext-comp-1002")
	private WebElement createBillingTypeButton;
	
	@FindBy(xpath="//a[text()='Automation']/../../td[6]/a")
	private WebElement deleteLink;
	
	
	public void navigateToCreateNewBillingTypePage(){
		createBillingTypeButton.click();
	}
	
	public void deleteBilling(){
		deleteLink.click();
		driver.switchTo().alert().accept();
	}
	
}






