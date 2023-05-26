package com.EasyCal.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataReader;
import utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataReader excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setup() {
		
		excel = new ExcelDataReader();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void BrowserTest() {
		
		driver = BrowserFactory.BrowserOptions(driver, config.getBrowser(), config.getAppURL());
	}
	
	@AfterClass
	public void tearDown() {
		
		BrowserFactory.closeBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		 
		if (result.getStatus() == ITestResult.FAILURE) {
			
			Helper.CapturedScreenShot(driver);
		}
	}

}
