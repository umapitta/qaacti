package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.acti.Base.DriverScript;
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
		usernametb.sendKeys(username);
		passwordtb.sendKeys(password);
		
		loginbutton.click();
		
	}
	public String verifyLoginpageTitle()
	{
		return driver.getTitle();
	}
	
	
	
}
	
	
	
	
	
	
