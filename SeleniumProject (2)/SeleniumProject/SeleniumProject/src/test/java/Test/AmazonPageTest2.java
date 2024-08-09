package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.AmazonPage;
import pageobject.AmazonPage2;

public class AmazonPageTest2 {
	// comment for trigger
	static WebDriver driver=null;

	public static void main(String[] args)
	{
		amazonsearch();
		addToCart();
		 try {
	            Thread.sleep(5000); // Wait for 5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		openCart();
		options();
		 try {
	            Thread.sleep(2000); // Wait for 5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		homepage();
		flag();
		cancel();
		openCart();
		 try {
	            Thread.sleep(2000); // Wait for 5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		//openProduct();
	}

	public static void amazonsearch() {
		driver= new ChromeDriver();
		//driver = new FirefoxDriver();
		try {
			driver.get("http://amazon.in/");
			//WebElement textsearch= driver.findElement(By.id("twotabsearchtextbox"));
			//textsearch.sendKeys("smartphone");
			//driver.findElement(By.id("nav-search-submit-button")).click();

			AmazonPage2.textboxsearch(driver).sendKeys("Apple Airpods Pro 2nd Generation");
			AmazonPage2.buttonsearch(driver).click();
			System.out.println("Successfully opened Amazon!");

		} 
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		} 
	}
	
	public static void addToCart() {
		AmazonPage2.addToCart(driver).click();
		System.out.println("Successfully added to cart!");
	}
	
	public static void openCart() {

		AmazonPage2.openCart(driver).click();
		System.out.println("Successfully open the cart!");
	}
	

	public static void options() {
		AmazonPage2.options(driver).click();
		System.out.println("Successfully open the all options!");
	}
	
	public static void homepage() {
		AmazonPage2.close(driver).sendKeys(Keys.RETURN);
		System.out.println("Successfully open the home page!");
	}
	
	public static void flag() {
		AmazonPage2.flag(driver).click();
		System.out.println("Successfully open the flag option!");
	}
	
	public static void cancel() {
		AmazonPage2.cancel(driver).click();
		System.out.println("Successfully cancelled the flag option!");
	}

	public static void openProduct() {
		AmazonPage2.cancel(driver).click();
		System.out.println("Successfully opened the product!");
	}
	
}
