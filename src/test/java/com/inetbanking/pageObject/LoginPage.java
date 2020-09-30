package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	//Constrator
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement textUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement textUserPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li/[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	
	// Action Method 
	public void setUserName(String uname)
	{
		textUserName.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		textUserPassword.sendKeys(pwd);
	}
	
	public void ClickSubmit()
	{
		btnLogin.click();
	}
	
	public void ClickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}
