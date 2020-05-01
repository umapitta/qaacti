package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Utils.Common;

public class TaskPage extends DriverScript {
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement btnAddNew ;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerOption ;
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']") WebElement customerNameTb ;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTextAreaButton;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement createCustomerBtn;
   // private WebElement createcustomerbutton;
	
	
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton()
	{
		Common.highLightElement(btnAddNew);
		btnAddNew.click();
	} 
	public void clickNewCustomerOption()
	{

		Common.highLightElement(newCustomerOption);
		newCustomerOption.click();
	}
	public void enterCustomerName(String customerName)
    {

		Common.highLightElement(customerNameTb);
		customerNameTb.sendKeys(customerName); 
    }
	 public void enterCustomerDescription(String customerDescription) 
	
     {
		 Common.highLightElement(customerDescriptionTextAreaButton);
		 customerDescriptionTextAreaButton.sendKeys(customerDescription);
     }
    
     public void clickCreateCustomerbutton()
     {
    	 Common.highLightElement(createCustomerBtn);
    	 createCustomerBtn.click();
     }
}
