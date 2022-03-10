package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	//  PAge Factory  - Object Repository
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement Pasword;
	
	@FindBy(xpath ="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement LoginBtn;
	
	@FindBy(linkText="Sign Up")
	WebElement signUp;
	
	
	
	// Initialization the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Actions
	
	public String  validateLoginPageTitle()
	{
		return driver.getTitle();
	}

	
	public HomePage loginFunctionality(String un , String pwd)
	{
		username.sendKeys(un);
		Pasword.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();
	}
	
	
}
