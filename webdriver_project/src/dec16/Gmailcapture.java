package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailcapture {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String visible_text =driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visible_text);
		String propertyvalue=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(propertyvalue);
		driver.quit();

	}

}
