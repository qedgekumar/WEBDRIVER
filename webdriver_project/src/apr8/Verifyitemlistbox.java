package apr8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Verifyitemlistbox {

	public static void main(String[] args) throws Throwable {
		String Item_present="Books";
		Boolean Item_Exist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items=dropdown.getOptions();
		System.out.println("No of items:"+all_items.size());
		for(WebElement each:all_items)
		{
			String actual_items=each.getText();
			if(actual_items.contains(Item_present))
			{
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)
		{
			System.out.println(Item_present+"   "+"item in list box");
		}
		else
		{
			System.out.println(Item_present+"   "+"item not in list box");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
