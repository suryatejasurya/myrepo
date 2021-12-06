package com.basicspractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POExample{
	 WebDriver driver;
	 
	@FindBy(id = "name")
	WebElement name;
	@FindBy(id = "phone")
	WebElement MobileNumber;
	@FindBy(id = "email")
	WebElement EmailAddress;
	@FindBy(id ="password")
	WebElement Password;
	@FindBy(id = "address")
	WebElement Address;
	@FindBy(name = "submit")
	WebElement submit;
	@FindBy(id = "female")
	WebElement radioboxselect;
	
	POExample(WebDriver d)
	{
	  driver = d;
	  PageFactory.initElements(d, this);
	}
	public void setName(String Name)
	{
		name.sendKeys(Name);
	}
	public void setPhone(String Phone)
	{
		MobileNumber.sendKeys("1234567");
	}
	public void setEmail(String email)
	{
		EmailAddress.sendKeys(email);
	}
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void setAddress(String add)
	{
		Address.sendKeys(add);
	}
	public void setButton()
	{
		submit.click();
	}
	public void setradiobox()
	{
		radioboxselect.click();
	}
	
	
	
	
}
	
	


