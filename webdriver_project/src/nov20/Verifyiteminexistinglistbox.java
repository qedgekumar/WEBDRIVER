package nov20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyiteminexistinglistbox {

	public static void main(String[] args) throws Throwable {
		String item_present="baby";
		Boolean item_exist=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox= new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in listbox
		List<WebElement>all_items=listbox.getOptions();
		System.out.println("No of items are::"+all_items.size());
		for (WebElement each : all_items) {
			String Actual_items = each.getText();
			Thread.sleep(500);
			System.out.println(Actual_items);
			if (Actual_items.equalsIgnoreCase(item_present)) {
				item_exist=true;
				break;
			}
			Thread.sleep(5000);
			}
		if (item_exist)//item exist holds true or false {
		{
			//if it is true
			System.out.println(item_present+"  "+" item in list box");
			
		}
	   else 
	   {
			System.out.println(item_present+"  "+" item not in list box");
		}
		driver.quit();
		
			
			
		}
		
		

	
		
}

	
