package nov18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listalllinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rediff.com");
		Thread.sleep(5000);
		//get collection of links which are stored into html tag a
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+all_links.size());
		Thread.sleep(5000);
		//print each link name
		for (WebElement each : all_links) {
			Thread.sleep(2000);
			System.out.println(each.getText());
			
		}
Thread.sleep(5000);
driver.quit();
	}

}
