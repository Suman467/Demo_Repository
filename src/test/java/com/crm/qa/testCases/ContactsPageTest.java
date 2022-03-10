package com.crm.qa.testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	
	LoginPage logpage;
	HomePage hompage;
	ContactsPage contpage;
	
	
	public ContactsPageTest()
	{
		super ();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		contpage= new ContactsPage();
		logpage= new LoginPage();
		hompage= logpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("PassWord"));
		contpage=hompage.clickOnContactsLink();
	}
	
	
	@Test
	public void  verifyContactsLabelTest()
	{
		
		Assert.assertTrue(contpage.verifyContactsLabelText(),"Conatct label is missing on pages");
		
	}
	
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
