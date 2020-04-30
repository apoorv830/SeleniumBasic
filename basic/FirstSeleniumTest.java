package com.selenium.basic;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class FirstSeleniumTest {
	@Test
	public void verifyfacebookhomepage(){
		String url="https://www.facebook.com";
		
		//Open URL with Selenium
		//Web Driver is interface in java
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//To maximize the driver
		driver.manage().window().maximize();
		
		driver.get(url);
		
		//Verify HomePage Title
		String pageTitle=driver.getTitle();
		System.out.println("We get the title like: "+pageTitle);
		Assert.assertEquals(pageTitle,"Facebook – log in or sign up");
		
		//To close the browser
		driver.close();
	}

}
