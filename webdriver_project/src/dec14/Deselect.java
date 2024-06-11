package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/MultiListboxHtmlpage_lyst7807.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = dropdown.isMultiple();
		for(int i=0;i<7;i++) {
			Thread.sleep(2000);
			dropdown.selectByIndex(i);
		}
		for(int j=0;j<7;j++) {
			dropdown.deselectByIndex(j);
			
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
