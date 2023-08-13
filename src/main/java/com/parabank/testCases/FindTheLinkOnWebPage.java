package com.parabank.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheLinkOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Link presenct in webpage:"+Links.size());
		
		for(WebElement link : Links) {
			System.out.println("Pinting the link"+link.getAttribute("href")+"\n");
			System.out.println("Text Name : "+link.getText());
		}
		Thread.sleep(3000);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		System.out.println("total count of the link on webpage"+Links.size());
		
		driver.quit();
		
	}

}
