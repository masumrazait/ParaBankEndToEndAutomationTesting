package com.parabank.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.wikipedia.org/");
		
		List<WebElement>href=driver.findElements(By.tagName("a"));
		
		System.out.println("Printing All Url in Website");
		
		System.out.println("Link :"+href.size());
		
		for(WebElement link:href) {
			System.out.println(link.getText()+"Toltal Number of link"+ href.size());
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
