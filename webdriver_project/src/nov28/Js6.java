package nov28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Js6 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[1]")).sendKeys("pavan");
		driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[3]")).sendKeys("pavan.arisetti8@gmail.com");
        driver.findElement(By.xpath("(//input[starts-with(@id,'u')])[4]")).sendKeys("pavan.arisetti8@gmail.com");
        driver.findElement(By.xpath("(//input[starts-with(@name,'reg')])[3]")).sendKeys("pavan@321");
        new Select(driver.findElement(By.xpath("(//select[contains(@title,'Da')])"))).selectByIndex(06);
        new Select(driver.findElement(By.xpath("(//select[contains(@title,'Mo')])"))).selectByIndex(06);
        new Select(driver.findElement(By.xpath("(//select[contains(@title,'Ye')])"))).selectByIndex(32);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

}
