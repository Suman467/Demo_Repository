

package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPagetest extends TestBase {
	
	LoginPage logpage;
	HomePage hompage;
	
	
	public LoginPagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		initialization();
		
		 logpage= new LoginPage();
	}
	
	@Test
	public void  loginTest()
	{
		hompage=logpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("PassWord"));
	}
	
	

	
	@AfterMethod
	public void testDown()
	{
		driver.quit();
	}
}
