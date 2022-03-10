package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreateNewContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CreateContactsPageTest extends TestBase {
	
	LoginPage logpage;
	HomePage hompage;
	ContactsPage contpage;
	CreateNewContactPage cncp;
	
	
	
	
	CreateContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		contpage= new ContactsPage();
		logpage= new LoginPage();
		hompage= logpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("PassWord"));
		contpage=hompage.clickOnContactsLink();
		cncp = new CreateNewContactPage();
		
	}
	
	@Test
	public void createContactTest()
	{
		
		cncp=contpage.clickOnCreateButton();
		//cncp.CreateNewContacts("Jack","Peter","Peter","Google");
		cncp.CreateNewContacts();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
	}

}
