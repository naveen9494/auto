package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CMDetail extends Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Launch.browser();
		Launch.Time();
		
		driver.findElement(By.xpath("//*[text()='Campaigns']")).click();

		
		
		driver.findElement(By.xpath("//*[@class='triggerLinkTextAndIconWrapper slds-p-right--x-large']")).click();
		Launch.Timeten();	
		
		
	
		WebElement el=driver.findElement(By.xpath("//div/ul/li[4]/a/span[2][1][1]"));
		el.sendKeys(Keys.ARROW_DOWN);
		el.sendKeys(Keys.ARROW_DOWN);
		el.sendKeys(Keys.ARROW_DOWN);
		el.sendKeys(Keys.ENTER);
		
		
		//driver.findElement(By.xpath("//div[1]/div/ul/li[4]/a/span[2]))
		
		
	
		driver.findElement(By.xpath("//tr[1]/th/span/a")).click();
		driver.findElement(By.xpath("//*[@title='DETAILS']")).click();
		
		
		
		
		//String a[] =new String[3];
		//a[0]= "text";
		
				
		
		
		
		
		
	}

}
