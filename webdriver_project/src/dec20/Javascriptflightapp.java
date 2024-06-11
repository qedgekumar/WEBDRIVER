package dec20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptflightapp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
		js.executeScript("document.getElementById('input-firstname').value='akhil'");
		js.executeScript("document.getElementById('input-lastname').value='yadav'");
		js.executeScript("document.querySelector('#input-email').value='test@gmail.com'");
		js.executeScript("document.querySelector('#input-password').value='test@123450'");
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.getElementById('input-newsletter-yes').click()");
		js.executeScript("document.getElementsByName('agree')[0].click()");
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
