package dec13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//img)[6]")).click();
		driver.findElement(By.xpath("(//img)[11]")).click();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//img)[11]")).click();
		driver.switchTo().alert().accept();
		String alertmessage1 = driver.switchTo().alert().getText();
		System.out.println(alertmessage1);
		driver.switchTo().alert().accept();
		driver.quit();
		

	}

}
