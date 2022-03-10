package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CreateNewContactPage extends TestBase{
	
	public Select select;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement FirstName;
	
	@FindBy(xpath= "//input[@name='last_name']")
	WebElement LastName;
	
	@FindBy(xpath= "//input[@name='middle_name']")
	WebElement MiddleName;
	
	@FindBy(name= "company")
	WebElement CompanyName;
	
	
	@FindBy(xpath="//div[@class='ui selection upward dropdown']")
	WebElement CategoryDropDown;    // Customer
	
	
	@FindBy(xpath="//div[@xpath='1']")
	WebElement Status;   // New
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")   // //*[@class='save icon']  button[@class='ui linkedin button']
	WebElement SaveBtn;
	
	public CreateNewContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void  CreateNewContacts()  //(String fn, String mn,String ln, String cm )
	{
		
		FirstName.sendKeys("Jack");
		MiddleName.sendKeys("Jack");
		LastName.sendKeys("Jack");
		CompanyName.sendKeys("Google");
		
		/*	
		select = new Select(CategoryDropDown);
		select.selectByVisibleText(category);
		
		
		select= new Select(Status);
		select.selectByVisibleText(status);
		*/
		SaveBtn.click();
		
		
		
	}
	
	
	
	

}
