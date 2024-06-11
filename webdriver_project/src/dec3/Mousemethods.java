package dec3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.moveToElement(driver.findElement(By.xpath("(//div[@class='YBLJE4'])[4]"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("//a[@class='_3490ry'][1]")));
		ac.click().perform();
		ac.pause(5000);
        ac.moveToElement(driver.findElement(By.xpath("//span[@class='_2I9KP_'][5]"))).perform();
        Thread.sleep(5000);
        ac.moveToElement(driver.findElement(By.xpath("//a[@class='_3QN6WI'][normalize-space()='Outdoor Toys']")));
        ac.click().perform();
        Thread.sleep(5000);
        driver.quit();
	}

}
