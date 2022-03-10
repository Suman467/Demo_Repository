package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class HomePageTest  extends TestBase{
	
	LoginPage logpage;
	HomePage hompage;
	ContactsPage contpage;
	
	
	public HomePageTest()
	{
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		
		logpage= new LoginPage();
		hompage= logpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("PassWord"));
	}
	


	
	@Test(priority=1)
	public void  verifyHomePageTitleTest()
	{
		String homepageTitle=hompage.verifyHomePagsTitle();
		Assert.assertEquals(homepageTitle, "Cogmento CRM","Home Page Title not matched");
		
	}
	
	
	
	
	
	@Test(priority=2)
	public void verifyuserNameTest()
	{
	   Assert.assertTrue(hompage.verifyCorrectUserName(), "User name is dispalying");
		
	}
	
	/*
	
	@Test(priority =3)
	public void printTitleTest()
	{
		hompage.clickOnContactsLink1();
	}
	
	
	*/
	
	
	@Test (priority=3)
	public void  clickOnContactsLinkTest()
	{
		contpage=hompage.clickOnContactsLink();
	}
	

	
	@AfterMethod(alwaysRun =true)
	public void tearDown()
	{
		driver.quit();
		
	}

}
