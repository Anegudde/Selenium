package com.qspiders;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeClass
	public void launch(){
		System.out.println("Launch Application");
	}	
	@BeforeMethod
	public void login(){
		System.out.println("Login");
	}
	@AfterMethod
	public void logout(){
		System.out.println("Logout");
	}
	@AfterClass
	public void quit(){
		System.out.println("Quit");
	}
}
