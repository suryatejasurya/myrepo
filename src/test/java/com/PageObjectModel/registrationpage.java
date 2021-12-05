package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationpage {
	WebDriver driver;
	
	@FindBy(name = "firstName")
	WebElement FirstName;
	
	@FindBy(name = "lastName")
	WebElement LastName;
	
     @FindBy(name = "phone")
     WebElement phone;
     
     @FindBy(name = "userName")
     WebElement email;
     
     @FindBy(name = "address1")
     WebElement Address;
     
     @FindBy(name = "city")
     WebElement city;
     
     @FindBy(name = "state")
     WebElement state;
     
     @FindBy(name = "postalCode")
     WebElement PostelCode;
     
     @FindBy(name = "country")
     WebElement country;
     
     @FindBy(name = "email")
     WebElement UserName;
     
     @FindBy(name = "password")
     WebElement Password;
     
     @FindBy(name = "confirmPassword")
     WebElement ConfirmPassword;
     
     @FindBy(name = "submit")
     WebElement Submit;
     registrationpage(WebDriver d)
     {
    	 driver =d;
    	 PageFactory.initElements(d, this);
     }
     public void setFirstName(String fname)
     {
    	 FirstName.sendKeys(fname);
     }
     public void setLastName(String lname)
     {
    	 LastName.sendKeys(lname);
     }
     public void setPhone(String ph)
     {
    	 phone.sendKeys(ph);
     }
     public void setEmail(String em)
     {
    	 email.sendKeys(em);
     }
     public void setAddress(String add)
     {
    	 Address.sendKeys(add);
     }
     public void setCity(String cityname)
     {
    	 city.sendKeys(cityname);
     }
     public void setState(String statename)
     {
    	 state.sendKeys(statename);
     }
     public void setPostelCode(String postel)
     {
    	 PostelCode.sendKeys(postel);
     }
     public void setCountry(String countryname)
     {
    	country.sendKeys(countryname);
     }
     public void setUserName(String user)
     {
    	 UserName.sendKeys(user);
     }
     public void setPassword(String passwordname)
     {
    	 Password.sendKeys(passwordname);
     }
     public void setConfirmPassword(String conformpassword)
     {
    	 ConfirmPassword.sendKeys(conformpassword);
     }
     public void setButton()
     {
    	 Submit.click();
     }
     
     
     
     
     
     
     
     
     
     
     
     
     

	

}
  