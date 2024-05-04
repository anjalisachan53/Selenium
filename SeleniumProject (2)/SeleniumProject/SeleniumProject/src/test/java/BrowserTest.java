import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args)
	{
		
		//ALREADY GAVE THE LOCATION OF FOLDER HAVING DRIVER IN ENVIRONEMNT VARIABLE PATH, HENCE NOT REQUIRED
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\sacha\\eclipse-workspace\\SeleniumProject\\Drivers\\geckodriver\\geckodriver.exe");

        // Initialize Firefox driver
        //WebDriver driver = new FirefoxDriver();
        
        WebDriver driver= new ChromeDriver();
        
        // Open YouTube
        try {
            driver.get("http://amazon.in/");
            WebElement textsearch= driver.findElement(By.id("twotabsearchtextbox"));
            textsearch.sendKeys("smartphone");
            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(3000);
            System.out.println("Successfully opened Amazon!");
            
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } 
        /*				TO AUTOMATICALLY CLOSE THE BROWSER
        finally {
            // Close the browser
            driver.quit();
        }
        */
	}
}
