package dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevents2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.pause(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"))).perform();
		ac.pause(5000);
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Clocks"))).click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
