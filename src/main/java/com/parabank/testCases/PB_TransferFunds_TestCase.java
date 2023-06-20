package com.parabank.testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pageObjects.LoginPage;
import com.parabank.pageObjects.OpenNewAccountPage;
import com.parabank.pageObjects.TransferFundsPage;

public class PB_TransferFunds_TestCase extends BaseClass {

	@Test
	public void TransferFundsTest() throws InterruptedException, IOException {

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
			captureScreen(driver, "TransferFundsTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

		tF.clickOnTransferFunds();
		//logger.info("user clicked on Open New Account");
		Thread.sleep(10000);
		//driver.getPageSource().contains("Open New Account");

		/*
		String AccountTypeName = "SAVINGS";
		Select AccontTypes = new Select(newAcct.selectAccountTypes());
		AccontTypes.selectByVisibleText(AccountTypeName);
		AccontTypes.selectByIndex(1);
		logger.info(AccountTypeName);
		*/
		tF.clickOnTransferSubmitBtn();
		logger.info("User Clicked on Transfer Menu!");
		Thread.sleep(3000);
		
		if (driver.getPageSource().contains("Congratulations, your account is now open.")) {
			Assert.assertTrue(true);
			captureScreen(driver, "TransferFundsTest");
			Assert.assertFalse(false);
			
			logger.info("account is now open test passed");
		} else {
			captureScreen(driver, "TransferFundsTest");
			Assert.assertTrue(false);
			logger.info("account is now open test failed");
		}

	}
}
