package feb20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterappJavascript {

	public static void main(String[] args) throws Throwable {
	WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("https://demo.opencart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	js.executeScript("document.querySelector(\"#input-firstname\").value='pavan'");
	js.executeScript("document.getElementById('input-lastname').value='kumar'");
	js.executeScript("document.getElementById('input-email').value='pavan.arisetti8@gmail.com'");
	js.executeScript("document.getElementById('input-password').value='test@1234'");
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(5000);
	js.executeScript("document.getElementByid('input-newsletter-yes').click()");
	js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
	js.executeScript("document.querySelector(\"button[type='submit']\").click()");
	driver.quit();

	}

}
