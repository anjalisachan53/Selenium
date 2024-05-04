package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("http://amazon.in/");
		
		System.out.println("Browser Name : " + driver.getTitle());
		
		WebElement textsearch= driver.findElement(By.id("twotabsearchtextbox"));
		textsearch.sendKeys("smartphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.close();
		System.out.println("Successfully opened Amazon!");
		
	}
}
