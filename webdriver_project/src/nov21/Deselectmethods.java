package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectmethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/MultiListboxHtmlpage_lyst7807.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify dropdown is single or multiselection
		Boolean value = dropdown.isMultiple();
		System.out.println(value);
		//select 0 to 7 items
		for(int i=0;i<7;i++) {
			Thread.sleep(2000);
			dropdown.selectByIndex(i);

		}

		//deselect from selection
		for (int j=0;j<7;j++) {
			Thread.sleep(2000);
			dropdown.deselectByIndex(j);

		}
		Thread.sleep(5000);
		driver.quit();
	}

}
