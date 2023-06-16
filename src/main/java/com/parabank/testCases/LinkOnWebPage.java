package com.parabank.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOnWebPage {
	
	public static void main(String Args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		Thread.sleep(2000);
		
		List<WebElement>href = driver.findElements(By.tagName("a"));
		
		System.out.println(href.size());
		
		for(WebElement link:href) {
			System.out.println(link.getText());
		}
		
		Thread.sleep(2000);
		
		System.out.println("Hellow");
		
		driver.quit();
	}
}