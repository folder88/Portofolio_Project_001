package com.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Utilities.Data_Files;
import com.Utilities.ReadConfing;

public class BaseClass {
	
	
	Data_Files data = new Data_Files();
	public static WebDriver driver;
	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", data.Chromepath());
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", data.FirefoxPath());
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("edge")){
			
			System.setProperty("webdriver.edge.driver",data.EdgePath());
			driver = new EdgeDriver();
		}
		driver.get("http://demo.guru99.com/v4/");
	}
	

}
