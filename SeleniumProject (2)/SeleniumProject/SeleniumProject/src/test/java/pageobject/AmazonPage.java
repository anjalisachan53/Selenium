package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage {

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
	
}
