package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.pages.Loginpage;
/*
 * script: Loginpage
 * tester:raj
 * Verified by:uma
 * Date created:
 * Last modified:
 */

public class LoginPageTest extends DriverScript{
	Loginpage lp;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		 lp = new Loginpage();
	}
	//@AfterMethod
	public void testverifyActiLogo1()
	{
		driver.close();
	}
	
	//@Test(priority=1)
	public void testverifyActiLogo()
	{
		
		Boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
	}
	//@Test(priority=2)
	public void testLoginpageTitle()
	{
		
		String title = lp.verifyLoginpageTitle();
		Assert.assertEquals("actiTIME - Login",title);
	}
	//@Test(priority=3)
	public void testvalidateLoginFunction()
	{
	
			lp.validateLogin("admin","manager");
		
		}
	@Test(priority=4)
	public void testvalidateLoginFunction1()
	{
		lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
}






