package dec17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplealerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//img)[5]")).click();
		driver.findElement(By.xpath("(//img)[11]")).click();
		String alert_message=driver.switchTo().alert().getText();
		System.out.println(alert_message);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//img)[11]")).click();
		driver.switchTo().alert().accept();
		String alert_message1=driver.switchTo().alert().getText();
		System.out.println(alert_message1);
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
