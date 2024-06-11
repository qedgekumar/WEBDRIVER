package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click sign 
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		//click capture alret message information
		String alert_message=driver.switchTo().alert().getText();
		System.out.println(alert_message);
		Thread.sleep(5000);
		//click ok button
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
