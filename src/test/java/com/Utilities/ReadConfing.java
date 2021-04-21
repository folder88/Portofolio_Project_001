package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfing {
	
	static Properties properties;
	
	//reading the file
	
	public ReadConfing() {
		File src = new File("./Configuration_Data/Configuration_Data");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
			
		}
		catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
		
	}
	
    //call methods
	
	public String getbaseUrl() {
		String url = properties.getProperty("BaseUrl");
		return url;
	}
	
	public String getUsername() {
		String userName = properties.getProperty("Username");
		return userName;
	}
	
	public String getPassword() {
		String password = properties.getProperty("Password");
		return password;
	}
	
	public String chromePath() {
		String chromepath = properties.getProperty("ChromePath");
		return chromepath;
	}
	public String firefoxPath() {
		String firefoxpath = properties.getProperty("FirefoxPath");
		return firefoxpath;
	}
	public String edgePath() {
		String edgepath = properties.getProperty("EdgePath");
		return edgepath;
	}
	
}
