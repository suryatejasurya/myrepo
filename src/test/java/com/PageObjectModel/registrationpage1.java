package com.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registrationpage1
 {
	@Test
	 public void verifyRegistrationPage()
	 {
		 
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		registrationpage rg = new registrationpage(driver);
		rg.setFirstName("surya");
		rg.setLastName("teja");
		rg.setPhone("1132687");
		rg.setEmail("djsakhj@12");
		rg.setAddress("sdjkla");
		rg.setCity("hyderbad");
		rg.setState("telnagana");
		rg.setPostelCode("50012");
		rg.setCountry("india");
		rg.setUserName("sjkadkfjdslj");
		rg.setPassword("12873ye");
		rg.setConfirmPassword("1287uiwei");
		rg.setButton();
	}
	
	 
 }
