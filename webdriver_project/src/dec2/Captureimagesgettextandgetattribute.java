package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captureimagesgettextandgetattribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String visibletext = driver.findElement(By.linkText("Images")).getText();
		System.out.println(visibletext);
		String propertyvalue = driver.findElement(By.partialLinkText("Imag")).getAttribute("href");
		System.out.println(propertyvalue);
		Thread.sleep(5000);
		driver.quit();

	}

}
