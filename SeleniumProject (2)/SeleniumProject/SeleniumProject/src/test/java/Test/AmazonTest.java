package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// comment for freestyle project
import pageobject.AmazonPage;

public class AmazonTest {

	static WebDriver driver=null;

	public static void main(String[] args)
	{
		amazonsearch();
	}

	//added a comment to test triggers of jenkins
	
	public static void amazonsearch() {
		driver= new ChromeDriver();
		//driver = new FirefoxDriver();
		try {
			driver.get("http://amazon.in/");

			System.out.println("Successfully opened Amazon!");

		} 
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		} 
	}
}
