package nov29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofcheckboxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/checkbox_1_lyst2257.html");
		Thread.sleep(5000);
		//getcollection of checkboxes in webpage
		List<WebElement>all_checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("no of checkboxes are::" +all_checkboxes.size());
		for (WebElement each : all_checkboxes) {
			//verify which checkbox is true and false
			boolean value= each.isSelected();
			//capture each checkbox name
			String checkboxname=each.getAttribute("value");
			System.out.println(checkboxname+"  "+value);
			//uncheck checkbox if already checked check checkbox if not selected
			each.click();
			Thread.sleep(5000);
			
		}
Thread.sleep(5000);
driver.quit();
	}

}
