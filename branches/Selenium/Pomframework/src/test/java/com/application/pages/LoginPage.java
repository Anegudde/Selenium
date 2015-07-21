package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Global WebDriver driver which can be used to 
	//switch to window/alert or get title etc
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		//Setting the driver with value from the Test class
		this.driver=driver;
		//Page decoration. Initialize the elements on this 
		//page with driver. Basically for @FindBy annotations
		//so that they can find the elements on this page
		PageFactory.initElements(driver, this);
	}
	
	//Find all the elements on the page
	@FindBy(id="username")
	private WebElement usernameTextbox;
	
	@FindBy(name="pwd")
	private WebElement pwdTextbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	//Action
	public void login(String un, String pw){
		usernameTextbox.sendKeys(un);
		pwdTextbox.sendKeys(pw);
		loginButton.click();
	}
	
}
