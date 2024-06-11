package march5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightApplication {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@href,'fl')])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pavan");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7382157977");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pavan.arisetti2@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Pavan@123");
		Select element=new Select(driver.findElement(By.xpath("//select[@name='gender']")));
		element.selectByIndex(1);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("07-07-1991");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
