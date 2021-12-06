package com.basicspractices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioboxesandcheckboxpractice {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
	}
	@Test
	@Parameters("myselection")
	public void dynamicRadioboxSelection(String myselection)
	{
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> selection=driver.findElements(By.id("//input[@name='optionsRadios']"));
		for(WebElement gender:selection)
		{
			if(gender.getAttribute("id").equals(myselection))
			{
				gender.click();
				
			}
			
		}
	}
	@Test
	@Parameters("checkboxselection")
	public void dynamicCheckboxSelection(String checkboxselection)
	{
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> select=driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		for(WebElement checkboxselect : select)
		{
			if(checkboxselect.getAttribute("value").equals(checkboxselection))
			{
				checkboxselect.click();
				break;
			}
		}
		
	}
	 @Test
	public void dropDown()
	{
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
          WebElement dropdown=driver.findElement(By.className("custom-select"));
		Select select=new Select(dropdown);
		select.deselectByVisibleText("Spain");
		select.deselectByIndex(2);
		select.deselectByValue("4");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
   
	
	
	
	
	
	
	

}
