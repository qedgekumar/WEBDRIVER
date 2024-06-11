package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalertmsg1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://primusbank.qedgetech.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	//click branches button
	driver.findElement(By.xpath("(//img)[5]")).click();
	Thread.sleep(5000);
	//click delete button
	driver.findElement(By.xpath("(//img)[19]")).click();
	Thread.sleep(5000);
	//capture alert text
	String alert_message = driver.switchTo().alert().getText();
	System.out.println(alert_message);
	Thread.sleep(5000);
	//click cancel button in alert text
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
	//click delete button
	driver.findElement(By.xpath("(//img)[19]")).click();
	Thread.sleep(5000);
	//capture alert text
	String alert_message1 = driver.switchTo().alert().getText();
	System.out.println(alert_message1);
	Thread.sleep(5000);
	//click ok button in alert
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	driver.quit();
	

	}

}
