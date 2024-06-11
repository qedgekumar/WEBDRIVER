package dec16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noofvisiblelinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		System.out.println("no of links::"+alllinks.size());
		for (WebElement each : alllinks) {
          System.out.println(each.getText());			
		}
		driver.quit();

	}

}
