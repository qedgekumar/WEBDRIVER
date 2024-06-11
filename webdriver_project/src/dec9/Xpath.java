package dec9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("pavan");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kumar");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("pavan.arisetti2@gmail.com");
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("pavan.arisetti2@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pavan@123");
        new Select(driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"))).selectByIndex(06);
        new Select(driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"))).selectByIndex(06);
        new Select(driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"))).selectByIndex(32);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        
        
	}

}
