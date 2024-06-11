package dec12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("(//span[contains(@class,'pk')])[3]")).click();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).click();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).click();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).click();
		ac.pause(5000);
		ac.sendKeys(Keys.ENTER).click();
		ac.pause(5000);
		driver.quit();

	}

}
