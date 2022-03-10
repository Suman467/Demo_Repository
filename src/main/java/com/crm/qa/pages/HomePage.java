package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;



public class HomePage extends TestBase{
	public static Actions action=  new Actions(driver);
	
	@FindBy(xpath="//*[@class='user-display']")
	WebElement UserNameLabel;
	
	
	@FindBy(xpath= "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	
	@FindBy(name= "Deals")
	WebElement dealsLink;
	
	@FindBy(name="Tasks")
	WebElement taskLink;
	
	
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCorrectUserName()
	{
		return UserNameLabel.isDisplayed();
	}
	
	
	public String  verifyHomePagsTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink()
	{
		
		
		action.moveToElement(contactsLink).click().build().perform();
		String Title= driver.getTitle();
		return new  ContactsPage();
	}
	
	public void clickOnContactsLink1()
	{
		
		
		action.moveToElement(contactsLink).click().build().perform();
		String ti = driver.getTitle();
		String ur= driver.getCurrentUrl();
		System.out.println("Contacts page title & Url  is  : " +(ti + ur));
		
	}
	
	 
	
	public String clickOnDealsLink()
	{
		action.moveToElement(dealsLink).click().build().perform();
		
		
		return driver.getTitle();
	}

	
	public String clickOnTaskLink()
	{
		action.moveToElement(taskLink).click().build().perform();
		return driver.getTitle();
	}

}
