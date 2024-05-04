package Test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demo.LoggerDemo;
import config.PropertiesFile;
import pageobject.AmazonPage;

public class AmazonTestNg {

	WebDriver driver=null;
	public static String browsername=null;
	private static Logger logger=LogManager.getLogger(LoggerDemo.class);
	
	@BeforeTest
	public void setTest() {
		PropertiesFile.getProperties();
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		
		//driver= new ChromeDriver();
		driver.get("http://amazon.in/");
		logger.info("Amazon website started");
	}

	
	@Test
	public void amazonsearch() {
		
		try {
			//driver.get("http://amazon.in/");
			logger.info("Navigated to amazon.in");
			WebElement textsearch= driver.findElement(By.id("twotabsearchtextbox"));
			textsearch.sendKeys("smartphone");
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String actualTitle=driver.getTitle();
			
			//IMPLEMENTING ASSERTION
			//Assert.assertEquals(actualTitle, expectedTitle);	
			System.out.println("Successfully opened Amazon!");

		} 
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		} 
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();;
	}
}
