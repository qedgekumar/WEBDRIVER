package apr7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofcheckboxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pavan/Downloads/checkbox_1_lyst2257.html");
		Thread.sleep(5000);
		//get collection of checkboxes in webpage
		List<WebElement>All_checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No of check boxes are::"+All_checkboxes.size());
		for(WebElement each:All_checkboxes)
		{
			//verify which check box is true or false
			Boolean value=each.isSelected();
			//capture each check box name
			String checkboxname=each.getAttribute("value");
			System.out.println(checkboxname+"  "+value);
			//uncheck checkbox if already checked checkbox if not checked
			each.click();
			Thread.sleep(5000);
			
		}
		driver.quit();

	}

}
