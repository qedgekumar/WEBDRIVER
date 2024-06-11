package registerflightapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		//click register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pavan");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("7702248408");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavan.arisetti@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Pavan@123");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-07-1992");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
