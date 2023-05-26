package com.EasyCal.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCal.Pages.BaseClass;
import com.EasyCal.Pages.LoginPage;

import utility.ExcelDataReader;

public class VerifyEasycalcLogin extends BaseClass{
	
	@Test
	public void loginApp() {
		
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("Sheet1",0,0);
		LoginPage logintest = PageFactory.initElements(driver, LoginPage.class);
		logintest.loginEasycal(excel.getStringData("Sheet1",0,0), excel.getStringData("Sheet1",0,1));
		
	}

}
