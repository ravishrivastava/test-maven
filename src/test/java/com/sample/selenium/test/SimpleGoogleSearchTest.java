package com.sample.selenium.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * 
 * To run this class, right click on the project and go to run-as menu and run Maven Test
 * 
 * Requirement :
 * 
 * 1. Java version must be 1.8
 * 2. Download browser specific driver
 * 
 * 
 * @author sgu187
 *
 */
public class SimpleGoogleSearchTest {

	@BeforeClass
	public void setup() {
		// You need to download firefox or chrome driver depends on which browser you are testing.
		// Download the driver and keeps it in some directory.
		// Specify the path here.
		// Specify system property webdriver.chrome.driver for chrome (Check for property name for other browsers)
		File file = new java.io.File("C:/selenium/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	}
	
	@Test
	public void testTitle() {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
	}
}
