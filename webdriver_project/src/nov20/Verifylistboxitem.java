package nov20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifylistboxitem {

	public static void main(String[] args) throws Throwable {
		String Item_present = "baby";
		boolean Item_exist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in listbox
		List<WebElement>all_items=listbox.getOptions();
		System.out.println("No of items are::"+all_items.size());
		for (WebElement each : all_items) {
			String Actual_Items=each.getText();
			Thread.sleep(500);
			System.out.println(Actual_Items);
			if (Actual_Items.equalsIgnoreCase(Item_present))           
			{
			Item_exist=true;	
				break;
				
			}
			if (Item_exist) {
				System.out.println(Item_present+" "+"Item exist in listbox");
				
			} else {
				System.out.println(Item_present+" "+"Item not exist in listbox");

			}
		
		
				
		}
		Thread.sleep(5000);
		driver.quit();	
		}

	
}
