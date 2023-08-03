package com.parabank.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://clients.zauca.com/login");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("Secondary_Navbar-Account")).click();
		
		driver.findElement(By.id("Secondary_Navbar-Account-Register")).click();
		
		driver.findElement(By.xpath("//img[@alt='Zauca']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)", "");
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
