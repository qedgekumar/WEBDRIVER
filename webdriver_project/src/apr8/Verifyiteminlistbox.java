package apr8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyiteminlistbox {

	public static void main(String[] args) throws Throwable {
		String item_present="Video Games";
		Boolean item_exist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items=dropdown.getOptions();
		System.out.println("No of items are:"+all_items.size());
		for(WebElement each:all_items)
		{
			String Actual_items=each.getText();
			if(Actual_items.contains(item_present))
			{
				item_exist=true;
				break;
			}
				
		}
		if(item_exist)
		{
			System.out.println(item_present+"    "+"Item Exist in listbox");
		}
		else
		{
			System.out.println(item_present+"  "+"item not exist in listbox");
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
