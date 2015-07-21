package com.application.tests;

import org.testng.annotations.Test;

import com.application.pages.BillingTypesPage;
import com.application.pages.EnterTimeTrackPage;
import com.application.pages.LoginPage;

public class DeleteBillingTest extends BaseClass{

	@Test
	public void testDeleteBilling(){
		String un = xllib.getExcelData("Login",1,0);
		String pw = xllib.getExcelData("Login",1,1);
		
		LoginPage lp = new LoginPage(driver);
		lp.login(un, pw);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToBillingTypesPage();
		BillingTypesPage btp = new BillingTypesPage(driver);
		btp.deleteBilling();
		btp.logout();
	}
}





