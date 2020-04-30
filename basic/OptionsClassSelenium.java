package com.selenium.basic;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OptionsClassSelenium {
	
	public void sampleOptionsSetBinary()
	{
		//open Specific Version of Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
		//set the binary part
		//It is used to provide the binary exe path of Browser.
		co.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		//open the web browser
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://google.com");
	}
	
	public void acceptCertificate()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setAcceptInsecureCerts(true);
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.get("https://cacert.org");
	}
	
	public void setProxy()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		
		//Create object Proxy class
		Proxy prx = new Proxy();
		prx.setProxyAutoconfigUrl("https://proxy.chercher.tech");
		
		//register the proxy with options class
		fo.setProxy(prx);
		
		//create object to firefox driver
		WebDriver driver = new FirefoxDriver(fo);
	}
	
	public void OpenHeadLess()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.manage().window().maximize();
		
		driver.get("https://cacert.org");
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "Welcome to CAcert.org");
	}
	
	public void setArguments()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-infobars");
		//open the web browser
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com");
	}
	
	public void SetBrowserNotification()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable-infobars");
		co.addArguments("--disable-notifications");
		//open the web browser
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://drupal-stage-web.weather.com/en-IN");
	}
	
	public void handleUnhandleAlert()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		//open the web browser
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://drupal-stage-web.weather.com/en-IN");
	}
	
	@Test
	public void SetPageLoadStorage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//open the web browser
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://drupal-stage-web.weather.com/en-IN");
	}

}
