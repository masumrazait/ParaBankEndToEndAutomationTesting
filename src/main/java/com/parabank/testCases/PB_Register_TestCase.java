package com.parabank.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pageObjects.RegisterPage;

public class PB_Register_TestCase extends BaseClass {

	@Test
	public void RegisterTest() throws InterruptedException, IOException {
		
		logger.info("URL is opened");
		RegisterPage rp=new RegisterPage(driver);
		
		rp.clickOnRegister();
		logger.info("User clicked on register Link");
		
		rp.setCustomerFirstName(readconfig.getCustomerFirstName());
		logger.info("User Entered the First Name.");
		
		rp.setCustomerLastName(readconfig.getCustomerLastName());
		logger.info("User Entered the Last Name.");
		
		rp.setCustomerAddress(readconfig.getCustomerAddress());
		logger.info("User Entered the Address.");
		
		rp.setCustomerCity(readconfig.getCustomerCity());
		logger.info("User Entered the City.");

		rp.setCustomerState(readconfig.getCustomerState());
		logger.info("User Entered the State.");
		
		rp.setCustomerZipCode(readconfig.getCustomerZipCode());
		logger.info("User Entered the ZipCode.");
		
		rp.setCustomerPhoneNumber(readconfig.getCustomerPhoneNumber());
		logger.info("User Entered the PhoneNumber.");
		
		rp.setCustomerSsn(readconfig.getCustomerSsn());
		logger.info("User Entered the Ssn.");
		
		rp.setCustomerUsername(readconfig.getCustomerUsername());
		logger.info("User Entered the Username.");
		
		rp.setCustomerPassword(readconfig.getCustomerPassword());
		logger.info("User Entered the Password.");
		
		rp.setCustomerRepeatedPassword(readconfig.getCustomerRepeatedPassword());
		logger.info("User Entered the RepeatedPassword.");
		
		rp.clickOnRegisterBtn();
		 
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains(readconfig.getDesboardTitle()));
		
		if(driver.getTitle().equals(readconfig.getDesboardTitle()))
		{
			Assert.assertTrue(true);
			logger.info("Account created Successfully! Customer landed to Para Bank Deshboard");
		}
		else
		{
			captureScreen(driver,"RegisterTest");
			Assert.assertTrue(false);
			logger.info("Account not created!");
		}	
	}

}
