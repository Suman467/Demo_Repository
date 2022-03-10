package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestUtil{
	

	@FindBy(xpath ="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")    //   //div[contains(text(),'Contacts')]
	WebElement contactLabel;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement CreateBtn; 
	
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean verifyContactsLabelText()
	{
		return contactLabel.isDisplayed();
	}
	
	
	public CreateNewContactPage clickOnCreateButton()
	{
		CreateBtn.click();
		return new CreateNewContactPage();
	}

}
