package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglistboxespordropdowns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select daylist = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist=new Select(driver.findElement(By.name("birthday_year")));
		boolean value=monthlist.isMultiple();
		System.out.println(value);
		daylist.selectByVisibleText("20");
		Thread.sleep(5000);
		monthlist.selectByVisibleText("Jul");
		Thread.sleep(5000);
		yearlist.selectByVisibleText("1992");
		Thread.sleep(5000);
		daylist.selectByIndex(07);
		Thread.sleep(5000);
		monthlist.selectByIndex(06);
		Thread.sleep(5000);
		yearlist.selectByIndex(32);
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
