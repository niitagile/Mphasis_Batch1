package com.example;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	// navigate to the web site
      driver.get("http://login.yahoo.com/");
      // Validate page title
      //Assert.assertEquals(driver.getTitle(), "Madison Island");
      
	  driver.findElement(By.id("login-username")).sendKeys("nidhikhandelwal09@yahoo.in"); //id locator for text box
      WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
      searchIcon.click();
      
  }
  @BeforeMethod
  public void beforeMethod() {
	// set path of Chromedriver executable
      System.setProperty("webdriver.chrome.driver",
              "D:\\GreatLearningAngularProjects\\chromedriver_win32/chromedriver.exe");

      // initialize new WebDriver session
      driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	// close and quit the browser
      driver.quit();
  }

}
