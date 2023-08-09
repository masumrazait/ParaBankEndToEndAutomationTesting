package com.parabank.testCases;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.qedgetech.com/sample-resumes/");
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		System.out.println("Print total nober of link in page"+Links.size());
		for (WebElement link: Links)
		{

			System.out.println("link: "+ link.getAttribute("href")+"\n");
			System.out.println("Text: "+ link.getText());
				
		}
		System.out.println("Print total nober of link in page"+Links.size());
		
		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * // Print the count of links System.out.println("Total number of links: " +
		 * links.size());
		 * 
		 * // Print the links and their text for (WebElement link : links) {
		 * System.out.println("Link: " + link.getAttribute("href")+"\n");
		 * System.out.println("Text: " + link.getText()); }
		 */
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
