package com.EasyCal.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCal.Pages.BaseClass;
import com.EasyCal.Pages.EasyCalculationRegister;
//import com.EasyCal.Pages.LoginPage;

import utility.ExcelDataReader;

public class VerifyEasyCalcRegister extends BaseClass {
	
	@Test
	public void registerApp() throws InterruptedException {
		
		ExcelDataReader excel = new ExcelDataReader();
		//excel.getStringData("Sheet1",0,0);
		EasyCalculationRegister registertest = PageFactory.initElements(driver, EasyCalculationRegister.class);
		registertest.registerEasycal(excel.getStringData("Sheet1",1,0), excel.getStringData("Sheet1",1,1),
				excel.getStringData("Sheet1",1,2),excel.getStringData("Sheet1",1,3));
		
	}

}
