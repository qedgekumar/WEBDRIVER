package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		String alert_message=driver.switchTo().alert().getText();
		System.out.println(alert_message);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.quit();
	}

}
