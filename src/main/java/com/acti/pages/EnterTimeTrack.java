package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acti.Base.DriverScript;

public class EnterTimeTrack extends DriverScript {
	
	
	@FindBy(xpath="//div[@id='container_tt']")WebElement Timetrack; 
	@FindBy(xpath="//a[contains(@class,'content tasks')]")WebElement Tasks; 
	@FindBy(xpath="//a[contains(@class,'userProfileLink username')]")WebElement JohnDoe; 
	@FindBy(xpath="//a[@id='logoutLink']")WebElement logoutbutton; 

	

}
