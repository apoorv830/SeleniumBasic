package com.selenium.basic;


import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {
	public static void main(String[] args) {
		WebDriver driver;
		String ch = null;
		String URL=("https://www.twitter.com"); 
		System.out.printf("1. Internet Explorer \n 2. Chrome \n 3. Firefox \n 4. OperaMini \n");
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextLine();

		switch(ch.toLowerCase()){
			case "ie":
				System.setProperty("webdriver.ie.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(URL);
				driver.close();
				break;

			case "chrome":
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(URL);
				driver.close();
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(URL);
				driver.close();
				break;

			case "operamini":
				System.setProperty("webdriver.opera.driver","C:\\Users\\Apoorv Sharma\\workspace\\cognizant\\JavaTraining\\Drivers\\operadriver.exe");
				driver = new OperaDriver();
				driver.get(URL);
				driver.close();
				break;

			default:
				System.out.println("Invalid Choice");
				System.exit(0);
				break;
		}
		sc.close();
	}

}
