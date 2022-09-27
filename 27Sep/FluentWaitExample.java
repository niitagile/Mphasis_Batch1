package com.example;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWaitExample {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"D:\\GreatLearningAngularProjects\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	  driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
	  driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
	  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	         .withTimeout(Duration.ofSeconds(30))
	         .pollingEvery(Duration.ofSeconds(10))
	         .ignoring(NoSuchElementException.class);
	   
	  WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		  
	  public WebElement apply(WebDriver driver) {
	  
		  WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
	  String getTextOnPage = element.getText();
	  if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
	  System.out.println(getTextOnPage);
	  return element;
	  }else{
	  System.out.println("FluentWait Failed");
	  return null;
	  }
	  }
	  });
  }
}
