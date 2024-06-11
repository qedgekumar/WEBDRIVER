package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flightapplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@name='name'])")).sendKeys("pavan");
		driver.findElement(By.xpath("(//input[@name='contact'])")).sendKeys("7702248408");
		driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("pavan.arisetti2@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys("pavan@123");
		new Select(driver.findElement(By.xpath("(//select[@name='gender'])"))).selectByVisibleText("Male");
		driver.findElement(By.xpath("(//input[@name='dob'])")).sendKeys("20-07-1992");
		driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
		driver.findElement(By.xpath("(//input[@name='submit'])")).click();
		driver.quit();
		
		
		

	}

}
