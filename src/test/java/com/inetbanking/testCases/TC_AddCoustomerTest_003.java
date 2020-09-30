package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.AddCoustomerPage;
import com.inetbanking.pageObject.LoginPage;

public class TC_AddCoustomerTest_003 extends BaseClase
 {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setpassword(password);
		logger.info("Password is provided");
		lp.ClickSubmit(); 
		
		Thread.sleep(3000);
		
		AddCoustomerPage addcust=new AddCoustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("Providing Customer details......");
		
		addcust.custName("Nikhil");
		addcust.custgender("male");
		addcust.custdob("05","10", "1991");
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		addcust.custcity("Pune");
		addcust.custstate("Maharashtra");
		addcust.custpinno("411035");
		addcust.custtelephoneno("7588956181");
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdeq");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation is Started... ");
		
		boolean res=driver.getPageSource().contains("Customer registed Successfully!!!"); // it returns true or false or boolean Value
		
		//we will do validation User is register or not 
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test Case is Passed");
			
		}
		else
		{
			logger.info("Test Case is Failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			
		}
		
		
	}
	
	
 }

	


