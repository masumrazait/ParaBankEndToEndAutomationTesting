package com.parabank.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent { 

public static WebDriver driver;

public static Boolean IsElementPresent(By by) {
	int size=driver.findElements(by).size();
	if (size==0) {
		return false;
	}else {
		return true;
	}
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println(IsElementPresent(By.xpath("//div[@id='bodyPanel']//div[3]")));
	
	Thread.sleep(3000);
	
	driver.quit();

	}

}
