package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/MultiListboxHtmlpage_lyst7807.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		for(int i=0;i<7;i++) {
			dropdown.selectByIndex(i);
		}
		for(int j=0;j<7;j++) {
			dropdown.deselectByIndex(j);
		}
		Thread.sleep(5000);
		driver.quit();
			
		

	}

}
