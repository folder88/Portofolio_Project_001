package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atest {

	public static void main(String[] args) {
		
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Login\\eclipse-workspace\\Portofolium_Project_001\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		LoginPage g = new LoginPage(driver);
		driver.get("http://demo.guru99.com/v4/");
		g.setPassword("folder");

	}

}
