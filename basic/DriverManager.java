package com.selenium.basic;

import java.util.Scanner;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {
	public void firefox(String url)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.quit();
	}
	
	public void chrome(String url)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.quit();
	}
	
	public void explorer(String url)
	{
		WebDriverManager.iedriver().setup();
		WebDriver driver= new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.quit();
	}
	public static void main(String[] args) {
		DriverManager web= new DriverManager();
		Scanner sc= new Scanner(System.in);
		String URL="https://www.twitter.com";
		System.out.printf("Enter Your Choice: \n 1.Firefox \n 2.Chrome \n 3.Internet Explorer\n");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			web.chrome(URL);
			break;
		case 2:
			web.firefox(URL);
			break;
		case 3:
			web.explorer(URL);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		sc.close();
	}
}
