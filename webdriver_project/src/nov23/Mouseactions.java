package nov23;

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
		//close login page
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.pause(5000);
		//move mouse to electrioncis
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")));
		ac.perform();
		ac.pause(5000);
		//move mouse to all and click
		ac.moveToElement(driver.findElement(By.linkText("All")));
		ac.click().perform();
		ac.pause(5000);
		//move mouse to baby and kids
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']")));
		ac.perform();
		Thread.sleep(5000);
		//move mouse to puzzles and click
		ac.moveToElement(driver.findElement(By.linkText("Puzzles")));
		ac.click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
