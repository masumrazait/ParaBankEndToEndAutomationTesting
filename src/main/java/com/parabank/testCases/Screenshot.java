package com.parabank.testCases;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver =null;
		driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(3000);
		
        // Capture the screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Generate the timestamp
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String timestamp = now.format(formatter);

            // Build the filename with the timestamp
            String filename = "screenshot_" + timestamp + ".png";

            // Save the screenshot with the timestamp in the filename
            FileUtils.copyFile(screenshotFile, new File("./Screenshots/" + filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();

	}

}
