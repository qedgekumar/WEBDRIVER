package dec14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nooflinks1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		System.out.println("no of alinks::"+all_links.size());
		for (WebElement each : all_links) {
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
