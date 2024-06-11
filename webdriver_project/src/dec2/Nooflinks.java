package dec2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nooflinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://irctc.com");
		Thread.sleep(5000);
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		System.out.println("No of links::"+all_links.size());
		Thread.sleep(5000);
		for (WebElement each : all_links) {
			Thread.sleep(2000);
			System.out.println(each.getText());


		}
		Thread.sleep(5000);
		driver.quit();
	}

}
