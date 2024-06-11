package apr7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencartapplication {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demo.opencart.com'");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-firstname\").value='pavan'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='kumar'");
		js.executeScript("document.getElementById('input-email').value='pavan.arisetti@gmail.com'");
		js.executeScript("document.getElementById('input-password').value='Test@123'");
		js.executeScript("window.scrollBy(0,900)");
		js.executeScript("document.getElementById('input-newsletter-yes').click()");
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		driver.quit();
		
		
		

	}

}
