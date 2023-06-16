package com.parabank.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTypesOfLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
		
		//Tag & ID
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Ra");
		
		//linkTex
		driver.findElement(By.linkText("Forgot login info?")).getClass();
		
		//Tag & attribute
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("za");
		
		//Tag class & attribute
		driver.findElement(By.cssSelector("input.input[name=ssn]")).sendKeys("Razaa");
		
		//Syntax for Relative xpath
		//tagName[@attribute='value']
		
		WebElement Xpath=driver.findElement(By.xpath("//input[@name='firstName']"));
		Xpath.clear();
		Xpath.sendKeys("Hello");
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
