package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.querySelector('#input-firstname').value='pavan'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='kumar'");
		js.executeScript("document.getElementById('input-email').value='pavan.arisetti@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='pavan@123'");
		js.executeScript("document.querySelector('body > main:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > fieldset:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)').click()");
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
