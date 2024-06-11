package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectitems {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/MultiListboxHtmlpage_lyst7807.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select dropdownbox = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = dropdownbox.isMultiple();
		System.out.println(value);
		for(int i=1;i<7;i++)
		{
			dropdownbox.selectByIndex(i);
		}
		for(int j=1;j<7;j++)
		{
			dropdownbox.deselectByIndex(j);
		}
		
		
		
		
		
		
		
		
		
     driver.quit();
	}

}
