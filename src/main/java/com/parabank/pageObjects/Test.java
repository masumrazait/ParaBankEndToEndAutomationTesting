package com.parabank.pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown= driver.findElement(By.id("searchLanguage"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Polski");
		Thread.sleep(2000);
		select.selectByIndex(21);
		Thread.sleep(2000);
		select.selectByValue("hi");

		System.out.println(dropdown.getText());
		
		
		driver.quit();

	}

}
