package com.application.tests;

import org.testng.annotations.Test;

import com.application.pages.EnterTimeTrackPage;
import com.application.pages.LoginPage;

public class LoginLogout extends BaseClass{

	@Test
	public void testLoginLogout() {				
		String un = xllib.getExcelData("Login", 1, 0);
		String pw = xllib.getExcelData("Login", 1, 1);
		LoginPage lp = new LoginPage(driver);		
		lp.login(un,pw);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.logout();
	}

}
