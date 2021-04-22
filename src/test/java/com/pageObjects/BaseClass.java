package com.pageObjects;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

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
	public static Logger Logger;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		
		
		
		Logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
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
