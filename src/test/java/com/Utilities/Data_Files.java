package com.Utilities;

import java.util.logging.Logger;

public class Data_Files {

	
	//data files
	
	String  BaseUrl = "http://demo.guru99.com/v4/";
	String	Username = "mngr318825";
    String	Password = "qYsEpes";
	String	ChromePath = "C:\\Users\\Login\\eclipse-workspace\\Portofolium_Project_001\\Drivers\\chromedriver.exe";
	String	FirefoxPath = "C:\\Users\\Login\\eclipse-workspace\\Portofolium_Project_001\\Drivers\\geckodriver.exe";
	String	EdgePath = "C:\\Users\\Login\\eclipse-workspace\\Portofolium_Project_001\\Drivers\\msedgedriver.exe";

	
	
	
	
	
	
	
	
	//methods to call the data
	
	public String BaseUrl() {
		return this.BaseUrl;
		
	}
	
	public String Username() {
		return this.Username;
	}
	public String Password() {
		return this.Password;
	}
	public String Chromepath() {
		return this.ChromePath;
	}
	public String FirefoxPath() {
		return this.FirefoxPath;
	}
	public String EdgePath() {
		return this.EdgePath;
				
	}
	
}
