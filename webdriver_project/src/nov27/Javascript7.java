package nov27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript7 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
		//fill the formwith javascript
		js.executeScript("document.querySelector(\"#input-firstname\").value='pavan'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='kumar'");
js.executeScript("document.querySelector(\"#input-email\").value='pavan.arisetti@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='pavan@123'");
		//scroll to certain pixel
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(5000);
		driver.quit();

	}

	
		
	}


