package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCM extends Launch {
	
	
	public static void main(String[] args) {
	
		Launch.browser();
		Launch.Time();
     
///  Test Case to create new Campaign:: code below>>>

				 driver.findElement(By.xpath("//*[text()='Campaigns']")).click();
				
				 if
				(driver.findElement(By.linkText("New")).isDisplayed())
				 {
					 System.out.println("New Enabled");
					 driver.findElement(By.linkText("New")).click();
				 }
				 else {
				 System.out.println("New DISABLE");
				 driver.quit();
				 }
				 driver.findElement(By.xpath("//*[text()='Next']")).click();
				//
				 
				 driver.findElement(By.xpath("//input[@maxlength='80']")).sendKeys("Test Name" );
				 driver.findElement(By.xpath("//input[@data-interactive-lib-uid='6']")).sendKeys("Test Local");
				 
				// to select value from lookup
				 
				WebElement ele = driver.findElement(By.xpath("//*[@title='Search Campaigns']"));
				ele.sendKeys("VC");
				
				ele.sendKeys(Keys.ARROW_DOWN);
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				ele.sendKeys(Keys.ENTER);
				 
				WebElement el =driver.findElement(By.xpath("//*[@aria-label='Type']"));
				el.click();
				el.sendKeys(Keys.ARROW_DOWN);
				el.findElement(By.xpath("//*[@title='Mass Email']")).click();
				
			driver.findElement(By.xpath("//*[@aria-label='Geography Scope']")).click();
			driver.findElement(By.xpath("//*[@title='Region']")).click();
				 
				 
			driver.findElement(By.xpath("//*[@aria-label='Geography']")).click();
			driver.findElement(By.xpath("//*[@title='APAC']")).click();
				 
			driver.findElement(By.xpath("//*[@title='Save']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	 
				 
			System.out.println("New Campaign is Created");
			
			driver.quit();
				 
}
}