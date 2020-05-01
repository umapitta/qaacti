package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.acti.Base.DriverScript;
import com.acti.Utils.Common;
/*
 * script: Loginpage
 * tester:raj
 * Verified by:uma
 * Date created:
 * Last modified:
 */

public class Loginpage extends DriverScript {
	
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement actiLogo; 
	@FindBy(xpath="//input[@id='username']")WebElement usernametb; 
	@FindBy(xpath="//input[@placeholder='Password']")WebElement passwordtb; 
	@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")WebElement loginbutton; 

	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyActiLogo()
	{
	return actiLogo.isDisplayed();
	}
	
	public void validateLogin(String username,String password)
	{
		Common.highLightElement(usernametb);
		usernametb.sendKeys(username);
		Common.highLightElement(passwordtb);
		passwordtb.sendKeys(password);
		Common.highLightElement(loginbutton);
		loginbutton.click();
		
	}
	public String verifyLoginpageTitle()
	{
		return driver.getTitle();
	}
	
	
	
}
	
	
	
	
	
	
