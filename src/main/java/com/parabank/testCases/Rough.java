package com.parabank.testCases;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aa");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1222");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(-3000);
		
		WebElement errorMessage=driver.findElement(By.xpath("//p[contains(text(), 'An internal error has occurred and has been logged.')]"));
		System.out.println(errorMessage.getText());
		
		
		
		driver.quit();

	}

}
