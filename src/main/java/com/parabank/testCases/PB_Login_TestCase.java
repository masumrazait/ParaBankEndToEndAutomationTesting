package com.parabank.testCases;
import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pageObjects.LoginPage;

public class PB_Login_TestCase extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(readconfig.getUsernameID());
		logger.info("User entered the User Name:");
		
		lp.setPassword(readconfig.getUserPasswordId());
		logger.info("User entered the password:");
		
		lp.clickSubmit();
		logger.info("User clicked on Login Button");
				
		if(driver.getTitle().equals("ParaBank | Accounts Overview"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	
	}

	
}
