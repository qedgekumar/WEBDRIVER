package apr8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flightapplication {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("balu");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("8888899999");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@123gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("hyderabad");
		Select element=new Select(driver.findElement(By.xpath("//select[@name='gender']")));
		element.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-4-1990");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.quit();
		
		

	}

}
