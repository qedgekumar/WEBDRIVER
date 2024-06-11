package dec16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items=listbox.getOptions();
		System.out.println("no of items are::"+all_items.size());
		for (WebElement each : all_items) {
			System.out.println(each.getText());
			
			
		}
		driver.quit();

	}

}
