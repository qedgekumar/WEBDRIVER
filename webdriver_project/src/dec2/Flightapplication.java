package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightapplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Register ')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pavan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pavan.arisetti8@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("pavan@321");
		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("7382157977");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-07-92");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'su')]")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
    
	}

}
