package com.example;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {

	private WebDriver driver;
	private String baseUrl;
	private WebElement element;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\GreatLearningAngularProjects\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl);
		element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("Selenium WebDriver Interview questions");
		element.sendKeys(Keys.RETURN);
		List<WebElement> list = driver.findElements(By.className("_Rm"));
		System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}