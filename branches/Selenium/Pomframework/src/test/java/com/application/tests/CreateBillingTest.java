package com.application.tests;

import org.testng.annotations.Test;

import com.application.pages.BillingTypesPage;
import com.application.pages.CreateNewBillingTypePage;
import com.application.pages.EnterTimeTrackPage;
import com.application.pages.LoginPage;

public class CreateBillingTest extends BaseClass{

	@Test
	public void testCreateBilling() {	
		String un=xllib.getExcelData("Login",1,0);
		String pw=xllib.getExcelData("Login",1,1);
		String billingName=xllib.getExcelData("CreateBillingTest",1,0);		
		LoginPage lp = new LoginPage(driver);		
		lp.login(un,pw);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToBillingTypesPage();
		BillingTypesPage btp = new BillingTypesPage(driver);
		btp.navigateToCreateNewBillingTypePage();
		CreateNewBillingTypePage c=new CreateNewBillingTypePage(driver);
		c.createBilling(billingName);
		btp.logout();
	}

}






