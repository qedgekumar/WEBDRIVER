package dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();ac.pause(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"))).click();
		ac.perform();ac.pause(5000);
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		ac.pause(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Soft Toys"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
			

	}

}
