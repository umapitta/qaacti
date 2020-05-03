package com.acti.Testcase;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.acti.Base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.Loginpage;
import com.acti.pages.TaskPage;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript {
	ExtentReporter htmlReport;
	ExtentReports extent;
	ExtentTest logger;
	public BaseTest()
	{
		super();
	}
	@BeforeClass
	public void preClass()
	{
		 htmlReport=new ExtentHtmlReporter("./actiReports/AutomationResult.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReport);
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

	//@AfterMethod
	public void testverifyActiLogo1()
	{
		driver.close();
		extent.flush();
	}
}
