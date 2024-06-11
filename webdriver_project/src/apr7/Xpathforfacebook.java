package apr7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpathforfacebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@id,u_0)])[6]")).click();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("pavan");
		driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[3]")).sendKeys("pavan.arisetti@gmail.com");
		driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[4]")).sendKeys("pavan.arisetti@gmail.com");
		driver.findElement(By.xpath("(//input[starts-with(@name,'reg')])[3]")).sendKeys("9441757670");
		new Select(driver.findElement(By.xpath("(//select[@name='birthday_day'])"))).selectByIndex(20);
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("(//select[contains(@id,'mo')])"))).selectByIndex(07);
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("(//select[contains(@id,'ye')])"))).selectByIndex(31);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@value='2'])")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.quit();
		

	}

}
