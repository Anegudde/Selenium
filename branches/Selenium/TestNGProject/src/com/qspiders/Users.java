package com.qspiders;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Users extends BaseClass{
	
	@Test(priority=0)
	public void createUser() {
		System.out.println("Create User");
		String expectedText="User created successfully";
		String actualText = "User created successfully";		
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=1)
	public void editUser() {
		System.out.println("Edit User");
	}
	@Test(priority=2)
	public void deleteUser() {
		System.out.println("Delete User");
	}
}
