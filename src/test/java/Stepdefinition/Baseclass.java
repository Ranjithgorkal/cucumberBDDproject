package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

		  public static WebDriver driver;

		    public void initDriver() {
		    	
		        driver = new ChromeDriver();
		       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\amarpatil\\AppData\\Local\\Programs\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		    }

		    public void closeDriver() 
		    
		    {
		        if (driver != null)
		        {
		            driver.quit();
		        }
		        
		    }
}
