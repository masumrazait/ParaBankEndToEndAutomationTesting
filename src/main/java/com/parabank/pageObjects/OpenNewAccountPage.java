package com.parabank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccountPage {
	WebDriver ldriver;
	
	public OpenNewAccountPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(partialLinkText="Open New Account")
	@CacheLookup
	WebElement OpenNewAccountLink;
	
	@FindBy(id = "type")
	@CacheLookup
    public WebElement SelectAccountType;
	
	@FindBy(xpath ="//input[@value='Open New Account']")
	@CacheLookup
	WebElement OpenNewAccountBtn;
	
	
	
	//Action Method 
	public void clickOnOpenNewAccount() {
		OpenNewAccountLink.click();
	}
	
    public WebElement selectAccountTypes() {
    	SelectAccountType.click();
    	return SelectAccountType;
    }
    
	public void clickOnOpenNewAccountSubmitBtn() {
		OpenNewAccountBtn.click();
	}
}
