package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// pipeline 
import pageobject.AmazonPage;

public class AmazonTest {

	static WebDriver driver=null;

	public static void main(String[] args)
	{
		amazonsearch();
	}

	//added comment to test triggers of jenkin
	
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
