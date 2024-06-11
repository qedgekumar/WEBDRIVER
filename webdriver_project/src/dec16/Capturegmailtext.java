package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturegmailtext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String visibletext = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visibletext);
		String propertyvalue = driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(propertyvalue);
		driver.quit();

	}

}
