package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[@class='popup_menu_icon settings_icon']")
	private WebElement settingsIcon;
	
	@FindBy(linkText="Billing Types")
	private WebElement billingTypesLink;
	
	public void logout(){
		logoutLink.click();
	}
	
	public void navigateToBillingTypesPage(){
		settingsIcon.click();
		billingTypesLink.click();
	}
}
