package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturegmailtextgettextandgetattribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String visible_text= driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visible_text);
		String property_value = driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(property_value);
		Thread.sleep(5000);
		driver.quit();
		

	}

}
