package com.parabank.testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
  private WebDriver driver;
  private String baseUrls;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrls = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDemo() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1536,713 | ]]
    driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("qwerty@123");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("qwerty@123");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.xpath("//input[@value = \"Log In\"]")).click();
    // Label: acc
    driver.findElement(By.xpath("//*[text() = \"18894\"]")).click();
    // Label: aactibbirt
    driver.findElement(By.id("month")).click();
    new Select(driver.findElement(By.id("month"))).selectByVisibleText("June");
    // Label: tyir
    driver.findElement(By.id("transactionType")).click();
    new Select(driver.findElement(By.id("transactionType"))).selectByVisibleText("Credit");
    // Label: hi
    driver.findElement(By.xpath("//input[@value = \"Go\"]")).click();
    driver.findElement(By.xpath("//input[@value = \"Go\"]")).click();
    driver.findElement(By.xpath("//input[@value = \"Go\"]")).click();
    // Label: oprm
    driver.findElement(By.xpath("//*[text() = \"Open New Account\"]")).click();
    driver.findElement(By.id("type")).click();
    new Select(driver.findElement(By.id("type"))).selectByVisibleText("SAVINGS");
    driver.findElement(By.id("fromAccountId")).click();
    driver.findElement(By.xpath("//input[@value = \"Open New Account\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Transfer Funds\"]")).click();
    driver.findElement(By.id("fromAccountId")).click();
    new Select(driver.findElement(By.id("fromAccountId"))).selectByVisibleText("19338");
    driver.findElement(By.id("toAccountId")).click();
    new Select(driver.findElement(By.id("toAccountId"))).selectByVisibleText("19338");
    driver.findElement(By.xpath("//input[@value = \"Transfer\"]")).click();
    driver.findElement(By.xpath("//*[contains(text(), \"Transfer Funds\")]")).click();
    driver.findElement(By.id("amount")).click();
    driver.findElement(By.id("amount")).clear();
    driver.findElement(By.id("amount")).sendKeys("1");
    driver.findElement(By.id("fromAccountId")).click();
    new Select(driver.findElement(By.id("fromAccountId"))).selectByVisibleText("18894");
    driver.findElement(By.xpath("//input[@value = \"Transfer\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
