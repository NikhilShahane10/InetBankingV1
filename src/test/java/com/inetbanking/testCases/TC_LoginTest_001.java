package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClase  
{
	
	@Test
	public void loginTest() throws IOException
	{
		
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enter USername");
		lp.setpassword(password);
		logger.info("Enter password");
		
		lp.ClickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
			
		}
		else
		{
			captureScreen( driver,"loginTest" );
			Assert.assertTrue(false);
			logger.info("Login test false");
		}
		
	}
	 

}
