package nov20;

import java.awt.ItemSelectable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countlistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		//store listbox into select class
		Select Listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in a listbox
		List<WebElement>all_items = Listbox.getOptions();
		System.out.println("No of items are::"+all_items.size());
		//print each item name
		for (WebElement each : all_items) {
			Thread.sleep(500);
			System.out.println(each.getText());
			
			
			
		}
        Thread.sleep(5000);
        driver.quit();
	}

}
