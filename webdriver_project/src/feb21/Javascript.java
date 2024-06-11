package feb21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javascript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com/'");
		driver.findElement(By.linkText("Create new account")).click();
		js.executeScript("document.querySelector(\"#u_8_b_Yg\").value='pavan'");
		js.executeScript("document.getElementById('u_8_d_/Q').value='kumar'");
		js.executeScript("document.querySelector(\"#u_8_g_zD\").value='pavan.arisetti8@gmail.com'");
		js.executeScript("document.querySelector(\"#u_8_j_s5\").value='pavan.arisetti8@gmail.com'");
		Select daylist=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist=new Select(driver.findElement(By.name("birthday_year")));
		daylist.selectByIndex(7);
		monthlist.selectByIndex(6);
		yearlist.selectByIndex(32);
		js.executeScript("document.querySelector(\"#u_8_5_S4\").click()");

	
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
