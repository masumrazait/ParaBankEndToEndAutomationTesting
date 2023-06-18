package com.parabank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Log In']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//a[contains(text(), 'Log Out')]")
	@CacheLookup
	WebElement logoutLink;

	@FindBy(xpath = "//p[contains(text(), 'An internal error has occurred and has been logged.')]")
	@CacheLookup
	WebElement InvalidCredentialErrorMsg;

	@FindBy(xpath = "//p[contains(text(), 'Please enter a username and password.')]")
	@CacheLookup
	WebElement errorMessageForCredential;

	public void setUsername(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String userPassword) {
		txtPassword.sendKeys(userPassword);
	}

	public String getErrorMessage() {
		return InvalidCredentialErrorMsg.getText();
	}

	public void clickSubmit() {
		btnLogin.click();
	}

	public void clickLogOut() {
		logoutLink.click();
	}

	public String getErrorMessageForEnterIdAndPassword() {
		return errorMessageForCredential.getText();
	}

}
