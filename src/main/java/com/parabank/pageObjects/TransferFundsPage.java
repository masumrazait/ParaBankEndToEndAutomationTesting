package com.parabank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPage {
	WebDriver ldriver;

	public TransferFundsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(partialLinkText = "Transfer Funds")
	@CacheLookup
	WebElement TransferFunds;

	@FindBy(xpath = "//input[@value='Transfer']")
	@CacheLookup
	WebElement TransferBtn;

	@FindBy(id = "amount")
	@CacheLookup
	WebElement txtAmount;

	@FindBy(id = "fromAccountId")
	@CacheLookup
	WebElement SelectFromAccnt;

	@FindBy(id = "toAccountId")
	@CacheLookup
	WebElement SelectToAccnt;

	// Action Method
	public void clickOnTransferFunds() {
		TransferFunds.click();
	}

	public void setAmount(String Amount) {
		txtAmount.sendKeys(Amount);
	}

	public WebElement selectFromAccount() {
		SelectFromAccnt.click();
		return SelectFromAccnt;
	}

	public WebElement selectToAccount() {
		SelectToAccnt.click();
		return SelectToAccnt;
	}

	public void clickOnTransferSubmitBtn() {
		TransferBtn.click();
	}

}
