package com.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utilities.XLUtils;
import com.pageObjects.BaseClass;
import com.pageObjects.LoginPage;
import org.testng.Assert;
public class Test_class extends BaseClass{

	


@Test(dataProvider = "LoginData")
public void loginDDT(String user,String pwd) throws InterruptedException{
	
	
	Logger.info("Step 01");
	LoginPage lp = new LoginPage(driver);
	Logger.info("Step 01");
	lp.setUserName(user);
	Logger.info("password provided");
	lp.setPassword(pwd);
	Logger.info("password provided");
	lp.clickSubmit();
	
	
	
	
	Thread.sleep(3000);
	
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();//close alert
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		Logger.warn("Login failed");
	}
	else
	{
		Assert.assertTrue(true);
		Logger.info("Login passed");
		lp.clickLogout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//close logout alert
		driver.switchTo().defaultContent();
		
	}
	
	
}


public boolean isAlertPresent() {
	try {
		driver.switchTo().alert();
		return true;
	}
	catch (Exception e) {
		return false;
	}
}





		@DataProvider(name = "LoginData")
		String[][] getData() throws IOException {
			
			 String Path = "C:\\Users\\Login\\eclipse-workspace\\Portofolium_Project_001\\src\\test\\java\\com\\testData\\LoginData.xlsx";
			
			int rownum = XLUtils.getRowCount(Path, "Sheet1");
			int colcount = XLUtils.getCellData(Path, "Sheet1", 1);
			
			String logindata[][]=new String [rownum][colcount];
			
			for(int i = 1;i < rownum;i++) {
				
				
				for(int j = 0;j< colcount;j++) {
					logindata[i-1][j]=XLUtils.getCellData(Path, "Sheet1", i, j);
					System.out.println(logindata[i-1][j]);
				}
				
			}
			return logindata;
		}
		
		
		
		
		
	
	

}
