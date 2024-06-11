package march5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countnooflinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://myntra.com");
		Thread.sleep(5000);
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		System.out.println("No of links"+all_links.size());
		for(WebElement each:all_links)
		{
			System.out.println(each.getText());
		}
		driver.quit();

	}

}
