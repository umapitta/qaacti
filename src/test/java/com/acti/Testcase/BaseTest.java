package com.acti.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.acti.Base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.Loginpage;
import com.acti.pages.TaskPage;

public class BaseTest extends DriverScript {


	public BaseTest()
	{
		super();
	}
	Loginpage lp;
	EnterTimePage	etp;
	TaskPage	tp;

	@BeforeTest
	public void preTest() {
		initApp();
		lp = new Loginpage();
		etp=new EnterTimePage();
		tp=new TaskPage();
	}

	@AfterMethod
	public void testverifyActiLogo1()
	{
		driver.close();
	}
}
