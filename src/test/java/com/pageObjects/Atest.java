package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Utilities.ReadConfing;

public class Atest extends BaseClass {

	public static void main(String[] args) {
		
		
		
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Login\\eclipse-workspace\\Portofolium_Project_001\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		//LoginPage g = new LoginPage(driver);
		//driver.get("http://demo.guru99.com/v4/");
		//g.setPassword("folder");

		ReadConfing x = new ReadConfing();
		String y = x.getPassword();
		String m = x.chromePath();
		System.out.println(m);
		
		
		BaseClass z = new BaseClass();
		z.setup("edge");
		
		
		
		
	}
	
	@Test
	public void method() {
		
		System.out.println("TestNg method");
		
	}

}
