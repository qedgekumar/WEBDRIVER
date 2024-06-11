package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxes {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("https://facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Create new account")).click();
	Select daylist = new Select(driver.findElement(By.name("birthday_day")));
	Select monthlist=new Select(driver.findElement(By.name("birthday_month")));
	Select yearlist=new Select(driver.findElement(By.name("birthday_year")));
	boolean value = monthlist.isMultiple();
	System.out.println(value);
	daylist.selectByVisibleText("22");
	monthlist.selectByVisibleText("Jul");
	yearlist.selectByVisibleText("1995");
	daylist.selectByIndex(7);
	monthlist.selectByIndex(7);
	yearlist.selectByIndex(31);
	driver.quit();

	}

}
