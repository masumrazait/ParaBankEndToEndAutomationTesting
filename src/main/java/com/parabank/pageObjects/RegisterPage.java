package com.parabank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//a[normalize-space()='Register']")
	@CacheLookup
	WebElement registerLink;
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	@CacheLookup
	WebElement txtUserFirstName;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	@CacheLookup
	WebElement txtUserLastName;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	@CacheLookup
	WebElement txtUserAddress;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	@CacheLookup
	WebElement txtUserCity;
	
	@FindBy(xpath="//form/table/tbody/tr[5]/td[2]/input")
	@CacheLookup
	WebElement txtUserState;
	
	@FindBy(xpath="//form/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtUserZipCode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	@CacheLookup
	WebElement txtUserPhoneNumber;
	
	@FindBy(xpath="//input[@id='customer.ssn']")
	@CacheLookup
	WebElement txtUserSsn;
	
	@FindBy(xpath="//input[@id='customer.username']")
	@CacheLookup
	WebElement txtCustomerUsername;
	
	@FindBy(xpath="//input[@id='customer.password']")
	@CacheLookup
	WebElement txtCustomerPassword;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	@CacheLookup
	WebElement txtCustomerRepeatedPassword;
	
	@FindBy(xpath ="//input[@value='Register']")
	@CacheLookup
	WebElement Register;
	
	//Action Method 
	public void clickOnRegister() {
		registerLink.click();;
	}
	
	public void setCustomerFirstName(String CustomerFirstName) {
		txtUserFirstName.sendKeys(CustomerFirstName);
	}
	
	public void setCustomerLastName(String CustomerLastName) {
		txtUserLastName.sendKeys(CustomerLastName);
	}
	
	public void setCustomerAddress(String CustomerAddress) {
		txtUserAddress.sendKeys(CustomerAddress);
	}
	
	public void setCustomerCity(String CustomerCity) {
		txtUserCity.sendKeys(CustomerCity);
	}
	
	public void setCustomerState(String CustomerState) {
		txtUserState.sendKeys(CustomerState);
	}
	
	public void setCustomerZipCode(String CustomerZipCode) {
		txtUserZipCode.sendKeys(CustomerZipCode);
	}
	
	public void setCustomerPhoneNumber(String CustomerPhoneNumber) {
		txtUserPhoneNumber.sendKeys(CustomerPhoneNumber);
	}
	
	public void setCustomerSsn(String CustomerSsn) {
		txtUserSsn.sendKeys(CustomerSsn);
	}
	
	public void setCustomerUsername(String CustomerUsername) {
		txtCustomerUsername.sendKeys(CustomerUsername);
	}
	
	public void setCustomerPassword(String CustomerPassword) {
		txtCustomerPassword.sendKeys(CustomerPassword);
	}
	
	public void setCustomerRepeatedPassword(String CustomerRepeatedPassword) {
		txtCustomerRepeatedPassword.sendKeys(CustomerRepeatedPassword);
	}
	
	public void clickOnRegisterBtn() {
		Register.click();;
	}
}
