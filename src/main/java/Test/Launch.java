package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Wait;

public class Launch {
	
	
	public static WebDriver driver;
	
	public static void browser() 
	{
	      //					Test Data 					 
		
	//*********************************************************//
		// To change # Browser # URL # Username # Password
		
		String Browser = "Fire";
		String URL = "https://test.salesforce.com";
		String uname = "campaign.manager.sf1@alcon.com.inttest";
		String pword = "Alcon2018";

	//*********************************************************//
		if (Browser== "Fire")
		{
		  driver = new FirefoxDriver();	
		}
		else if (Browser== "IE")
		{
			System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
	    driver.findElement(By.id("Login")).click();
	    
	  
	}
	
	public static void Time()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void Timeten()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	

//************************************* Main method *********************************
	
	public static void main(String[] args) {
	Launch.browser();
	
	}
}
