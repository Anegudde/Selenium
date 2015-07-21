package com.qspiders;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Billing extends BaseClass{
	
	@Test
	public void createBilling(){
		System.out.println("Create Billing");
		String expectedText="Billing created successfully";
		String actualText = "Billing created successfully";//"Billing failed to create";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("This will not execute if assert fails");
	}
	
	@Test(dependsOnMethods={"createBilling"})
	public void editBilling(){
		System.out.println("Edit Billing");
	}
	@Test(dependsOnMethods={"editBilling"})
	public void deleteBilling(){
		System.out.println("Delete Billing");
	}

}
