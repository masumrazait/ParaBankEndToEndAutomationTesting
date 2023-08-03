package com.parabank.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,40000)", "");
		Thread.sleep(3000);
		
		
		JavascriptExecutor up =(JavascriptExecutor) driver;
		up.executeScript("window.scrollTo(40000,0)", "");
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
