package com.parabank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath ="//input[@value='Log In']")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUsername(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String userPassword) {
		txtPassword.sendKeys(userPassword);
	}
	
	public void clickSubmit() {
		btnLogin.click();;
	}

}
