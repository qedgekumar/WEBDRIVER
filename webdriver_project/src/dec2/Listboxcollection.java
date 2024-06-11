package dec2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxcollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select listboxes = new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement>all_products=listboxes.getOptions();
        System.out.println("no of products::"+all_products.size());
        for (WebElement each : all_products) {
        	Thread.sleep(5000);
        	System.out.println(each.getText());
			
		}
        Thread.sleep(5000);
        driver.quit();
	}

}
