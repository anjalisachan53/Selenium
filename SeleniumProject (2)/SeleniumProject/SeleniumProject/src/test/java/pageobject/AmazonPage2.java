package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage2 {

private static WebElement element=null;
	
	public static WebElement textboxsearch(WebDriver driver)
	{
		element=driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}
	
	public static WebElement buttonsearch(WebDriver driver)
	{
		element=driver.findElement(By.id("nav-search-submit-button"));
		return element;
	}
	
	public static WebElement openCart(WebDriver driver)
	{
		element=driver.findElement(By.id("nav-cart-text-container"));
		return element;
	}
	
	public static WebElement addToCart(WebDriver driver)
	{
		element=driver.findElement(By.id("a-autoid-1"));
		return element;
	}
	
	public static WebElement options(WebDriver driver)
	{
		element=driver.findElement(By.className("hm-icon-label"));
		return element;
	}
	
	public static WebElement close(WebDriver driver)
	{
		element=driver.findElement(By.id("nav-logo-sprites"));
		return element;
	}
	
	public static WebElement flag(WebDriver driver)
	{
		element=driver.findElement(By.id("icp-nav-flyout"));
		return element;
	}
	
	public static WebElement cancel(WebDriver driver)
	{
		element=driver.findElement(By.id("icp-cancel-button"));
		return element;
	}
	
	public static WebElement openProduct(WebDriver driver)
	{
		element=driver.findElement(By.className("a-list-item"));
		return element;
	}
	
	
	
}
