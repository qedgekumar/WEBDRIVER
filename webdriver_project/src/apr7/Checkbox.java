package apr7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/pavan/Downloads/checkbox_1_lyst2257.html");
		Thread.sleep(5000);
		List<WebElement>All_checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No of checkboxes are::"+All_checkboxes.size());
		for(WebElement each:All_checkboxes)
		{
			Boolean value=each.isSelected();
			String checkboxname=each.getAttribute("value");
			System.out.println(checkboxname+"    "+value);
			each.click();
			Thread.sleep(5000);
		}
		driver.quit();

	}

}
