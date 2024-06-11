package dec2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIstbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Select daylist = new Select(driver.findElement(By.id("day")));
		List<WebElement>all_days=daylist.getOptions();
		System.out.println("No of days::"+all_days.size());
		for (WebElement each : all_days) {
			Thread.sleep(5000);
			System.out.println(each.getText());
			
			
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
