package dec3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[contains(@name,tx)])[7]")).sendKeys("Admin");
		driver.findElement(By.xpath("(//input[contains(@name,tx)])[8]")).sendKeys("Admin");
		driver.findElement(By.xpath("(//input[contains(@name,tx)])[9]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@href,er)])[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@href,ja)])[15]")).click();
		Thread.sleep(5000);
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@href,ja)])[15]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String alert_message1=driver.switchTo().alert().getText();
		System.out.println(alert_message1);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
