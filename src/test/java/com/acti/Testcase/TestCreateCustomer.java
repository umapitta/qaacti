package com.acti.Testcase;

import org.testng.annotations.Test;

public class TestCreateCustomer extends BaseTest {

	
	
	@Test
	public void testCreateCustomer()
	{
		
		lp.validateLogin("admin", "manager");
		String userlogged =etp.getUserLoggedInText() ;
		System.out.println(userlogged);
		etp.clickTaskmenu();
		tp.clickAddNewButton();
		tp.clickNewCustomerOption();
		tp.enterCustomerName("umTestCustomer12");
		tp.enterCustomerDescription("Creating dummy customer for test");
		tp.clickCreateCustomerbutton();
		etp.clickLogoutLink();
		}
	
	}
	
