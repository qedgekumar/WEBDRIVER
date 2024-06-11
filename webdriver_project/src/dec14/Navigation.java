package dec14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   System.out.println("page title[1]"+driver.getTitle());
	   driver.findElement(By.linkText("Gmail")).click();
	   System.out.println("page title[2]"+driver.getTitle());
	   driver.navigate().back();
	   System.out.println("page title[3]"+driver.getTitle());
	   driver.navigate().forward();
	   System.out.println("page title[4]"+driver.getTitle());
	   driver.navigate().refresh();
	   driver.quit();

	}

}
