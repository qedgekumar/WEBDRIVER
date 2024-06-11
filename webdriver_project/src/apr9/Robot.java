package apr9;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail")));
		ac.contextClick().perform();
		Thread.sleep(5000);
		java.awt.Robot r= new java.awt.Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(brw.get(1));
		ac.moveToElement(driver.findElement(By.xpath("(//div[contains(.,'Create an account')])[4]"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(brw.get(0));
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
