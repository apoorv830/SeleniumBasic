package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");
		//Find WebElement InputBox "Name"
		WebElement txtUserId=driver.findElement(By.xpath("//input[@name]"));
		
	}

}
