package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver driver;
	@Test
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources")
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
	
		
	}

}
