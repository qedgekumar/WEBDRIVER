package dec9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxescollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/checkbox_1_lyst2257.html");
		Thread.sleep(5000);
		List<WebElement>all_checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("no of checkboxes are::"+all_checkboxes.size());
		for (WebElement each : all_checkboxes) {
			boolean value  = each.isSelected();
			String checkboxname=each.getAttribute("value");
			System.out.println(checkboxname+"   "+value);
			each.click();
			Thread.sleep(5000);
			
			
		}
      Thread.sleep(5000);
      driver.quit();
	}

}
