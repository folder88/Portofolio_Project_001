package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	String one = "one";
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		String folder = this.one;
		System.out.println(folder);
		
	}

	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUsername;
	
	
	
	public void setPassword(String pwd) {
		
	txtUsername.sendKeys(pwd);
		
		
		
	}
	
}
