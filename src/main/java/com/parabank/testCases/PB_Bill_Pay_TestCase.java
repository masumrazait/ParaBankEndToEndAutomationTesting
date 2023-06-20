package com.parabank.testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pageObjects.LoginPage;
import com.parabank.pageObjects.TransferFundsPage;

public class PB_Bill_Pay_TestCase extends BaseClass {

	@Test(priority = 1)
	public void BillPayWithoutAmountTest() throws InterruptedException, IOException {

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		TransferFundsPage tF = new TransferFundsPage(driver);

		lp.setUsername(readconfig.getUsernameID());
		logger.info("User entered the User Name:");

		lp.setPassword(readconfig.getUserPasswordId());
		logger.info("User entered the password:");
		Thread.sleep(2000);
		lp.clickSubmit();

		logger.info("User clicked on Login Button");
		Thread.sleep(2000);

		if (driver.getTitle().equals("ParaBank | Accounts Overview")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "BillPayWithoutAmountTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

		tF.clickOnTransferFunds();
		logger.info("user clicked on Transfer Funds Menu for Transfer money! ");
		Thread.sleep(3000);

		tF.clickOnTransferSubmitBtn();
		logger.info("User Submited the Transfer !");
		Thread.sleep(3000);

		if (driver.getPageSource().contains("The amount cannot be empty.")) {
			Assert.assertTrue(true);
			logger.info("The amount cannot be empty. test passed!");
		} else {
			captureScreen(driver, "BillPayWithoutAmountTest");
			Assert.assertTrue(false);
			logger.info("Funds is Tranfer test failed");
		}

	}

	@Test(priority = 2)
	public void BillPayWithValidDetailsTest() throws InterruptedException, IOException {

		logger.info("URL is opened");
		TransferFundsPage tF = new TransferFundsPage(driver);

		tF.clickOnTransferFunds();
		logger.info("user clicked on Transfer Funds Menu for Transfer money! ");
		Thread.sleep(3000);

		tF.setAmount(readconfig.getAmount());
		logger.info("user entered the Amount for transfer funds!");

		Select FromAccount = new Select(tF.selectFromAccount());
		FromAccount.selectByIndex(1);
		logger.info("User choose from account number#");

		Select ToAccount = new Select(tF.selectToAccount());
		ToAccount.selectByIndex(1);
		logger.info("User choose to account number#");

		tF.clickOnTransferSubmitBtn();
		logger.info("User Clicked on The amount cannot be empty. Menu!");

		if (driver.getPageSource().contains("Transfer Complete!")) {
			Assert.assertTrue(true);
			logger.info("Transfer Complete! test passed");
		} else {
			captureScreen(driver, "BillPayWithValidDetailsTest");
			Assert.assertTrue(false);
			logger.info("Transfer not Complete! test failed");
		}

	}
}
