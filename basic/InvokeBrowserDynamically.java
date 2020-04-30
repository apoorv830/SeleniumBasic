package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeBrowserDynamically {
	
	static WebDriver driver=null;
	
	@Parameters("browser")
	@BeforeMethod
	public void OpenBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.opera.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\operadriver.exe");
			driver = new OperaDriver();
		}
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@Test
	public static void main(String[] args) {
		String URL="https://www.facebook.com";
		driver.get(URL);
		
		String pageTitle=driver.getTitle();
		System.out.println("We get the title like: "+pageTitle);
		Assert.assertEquals(pageTitle, "Facebook - log in or sign up");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
