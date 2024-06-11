package dec16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxverify {

	public static void main(String[] args) {
		String Item_present ="baby";
		boolean Item_Exist= false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items=listbox.getOptions();
		System.out.println("no of items are::"+all_items.size());
		for (WebElement each : all_items) {
			String Actual_items = each.getText();
			System.out.println(Actual_items);
			if (Actual_items.equalsIgnoreCase(Item_present)) {
				Item_Exist=true;
				break;
				
			}
			
		}
		if (Item_Exist) {
			System.out.println(Item_present+" "+"Item Exist in Listbox");
			
		} else {
			System.out.println(Item_present+"  "+"Item Not Exist in Listbox");

		}
		driver.quit();		

	}

}
