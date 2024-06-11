package apr8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select daylist=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist=new Select(driver.findElement(By.name("birthday_year")));
		Boolean value=monthlist.isMultiple();
		System.out.println(value);
		daylist.selectByVisibleText("20");
		Thread.sleep(5000);
		monthlist.selectByVisibleText("Jul");
		Thread.sleep(5000);
		yearlist.selectByVisibleText("1992");
		Thread.sleep(5000);
		daylist.selectByIndex(19);
		Thread.sleep(5000);
		monthlist.selectByIndex(6);
		Thread.sleep(5000);
		yearlist.selectByIndex(31);
		Thread.sleep(5000);
		driver.quit();

	}

}
