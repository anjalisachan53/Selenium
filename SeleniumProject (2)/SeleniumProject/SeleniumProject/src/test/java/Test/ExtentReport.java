package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {

	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	WebDriver driver=null;
	
	@BeforeSuite
	public void setUp()
	{
		sparkReporter = new ExtentSparkReporter("extentReport.html");
		//ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	
	@BeforeTest
	public void setTest() {
		driver= new ChromeDriver();
		driver.get("http://amazon.in/");
		
	}
	
	
	@Test
	public void Test1() {
		//ExtentTest test = extent.createTest("MyFirstTest");
		ExtentTest test=extent.createTest("MyFirstTest", "Test Description");
		
		//driver.get("http://amazon.in/");
		WebElement textsearch= driver.findElement(By.id("twotabsearchtextbox"));
		textsearch.sendKeys("smartphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		test.fail("Navigatedd to amazon ");
		test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());       
        
	}
	
	@Test
	public void Test2() {
		//ExtentTest test = extent.createTest("MyFirstTest");
		ExtentTest test=extent.createTest("MySecondTest", "Test Description");
		
		//driver.get("http://amazon.in/");
		WebElement textsearch= driver.findElement(By.id("twotabsearchtextbox"));
		textsearch.sendKeys("smartphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		test.fail("Navigatedd to amazon ");
		test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
	}
	
	
	@AfterTest
	public void exit1()
	{
		driver.close();;
	}
	
	
	
	@AfterSuite
	public void exit() {
		extent.flush();
	}
}
