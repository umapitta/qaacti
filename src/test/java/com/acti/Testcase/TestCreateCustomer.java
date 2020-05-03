package com.acti.Testcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestCreateCustomer extends BaseTest {

	
	
	

	private ExtentTest logger;

	@Test
	public void testCreateCustomer()
	{
		logger=extent.createTest("create Customer under Task Menu");
		lp.validateLogin("admin", "manager");
		logger.log(Status.PASS,"Login Successfull");		
         etp.clickTaskmenu();
		logger.log(Status.INFO,"Clicked on Task Menu");
		tp.clickAddNewButton();
		logger.log(Status.INFO,"clicked on Add New Button");
		tp.clickNewCustomerOption();
		logger.log(Status.INFO,"Clicked New Customer Option");
		tp.enterCustomerName("umTestCustomer12");
		logger.log(Status.INFO,"Entered customer name");
		tp.enterCustomerDescription("Creating dummy customer for test");
		logger.log(Status.INFO,"Entered CustomerDescription");
		tp.clickCreateCustomerbutton();
		logger.log(Status.INFO,"Clicked on create customer button");
		logger.log(Status.PASS,"customer created succesfully");
		etp.clickLogoutLink();
		logger.log(Status.PASS,"Logged out from the application");
		}
	
	}
	
