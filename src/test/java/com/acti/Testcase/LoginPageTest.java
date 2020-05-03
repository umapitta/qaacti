package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;


/*
 * script: Loginpage
 * tester:raj
 * Verified by:uma
 * Date created:
 * Last modified:
 */

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void testverifyActiLogo()
	{
		
		System.out.println("calling testverifyActiLogo ");
		boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
	}
    @Test(priority=2)
	public void testLoginpageTitle()
	{
		
		String title = lp.verifyLoginpageTitle();
		Assert.assertEquals("actiTIME - Login",title);
	}
	@Test(priority=3)
	public void testvalidateLoginFunction()
	{
	
		//	lp.validateLogin("admin","manager");
			lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		}
//	@Test(priority=4)
	public void testvalidateLoginFunction1()
	{
		lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
}






