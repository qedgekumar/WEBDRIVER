package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		Select daylist=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist=new Select(driver.findElement(By.name("birthday_year")));
		boolean value = monthlist.isMultiple();
		System.out.println(value);
		daylist.selectByVisibleText("13");
		monthlist.selectByVisibleText("Oct");
		yearlist.selectByVisibleText("1992");
		daylist.selectByIndex(9);
		monthlist.selectByIndex(8);
		yearlist.selectByIndex(32);
		driver.quit();
		
		

	}

}
