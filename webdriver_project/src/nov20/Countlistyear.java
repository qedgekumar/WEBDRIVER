package nov20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countlistyear {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Select listbox= new Select(driver.findElement(By.id("year")));
		List<WebElement>all_items=listbox.getOptions();
		System.out.println("No of items are::"+all_items.size());
	    for (WebElement each : all_items) {
	    	Thread.sleep(500);
	    	System.out.println(each.getText());
	    	
			
		}
		
          Thread.sleep(5000);
          driver.quit();
	}

}
