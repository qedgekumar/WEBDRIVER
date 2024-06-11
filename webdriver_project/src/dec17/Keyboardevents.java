package dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		Actions  ac = new Actions(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Create account']")).click();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.pause(5000);
		ac.sendKeys(Keys.ENTER).perform();
		ac.pause(5000);
		driver.quit();

	}

}
