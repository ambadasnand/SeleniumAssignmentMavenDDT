package com.EasyCal.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EasyCalculationRegister {
	
WebDriver driver;
	
	public EasyCalculationRegister(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "log_rgstr")
	WebElement registerClick;
	
	@FindBy(id = "xreg_usr")
	WebElement displayName;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(id = "xreg_confirm")
	WebElement confirmpass;
	
	@FindBy(id = "xreg_cnt")
	WebElement country;
	
	@FindBy(id = "xreg_submit")
	WebElement createActBtn;
	
	
	public void registerEasycal(String uname, String emailid, String pass, String confpass) throws InterruptedException {
		
		registerClick.click();
		Thread.sleep(4000);
		displayName.sendKeys(uname);
		email.sendKeys(emailid);
		password.sendKeys(pass);
		confirmpass.sendKeys(confpass);
		Select s = new Select(country);
		s.selectByVisibleText("India");
		createActBtn.click();
	}

}
