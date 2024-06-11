package nov18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxes {

	public static void main(String[] args) throws Throwable {
		WebDriver pavan = new ChromeDriver();
		pavan.manage().window().maximize();
		pavan.manage().deleteAllCookies();
		pavan.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		pavan.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		Select daylist = new Select(pavan.findElement(By.name("birthday_day")));
		Select monthlist=new Select(pavan.findElement(By.name("birthday_month")));
		Select yearlist = new Select(pavan.findElement(By.name("birthday_year")));
		Boolean value = monthlist.isMultiple();
		System.out.println(value);
		daylist .selectByVisibleText("22");
		Thread.sleep(5000);
		monthlist.selectByVisibleText("Jul");
		Thread.sleep(5000);
		yearlist.selectByValue("1995");
		Thread.sleep(5000);
		daylist.selectByIndex(21);
		Thread.sleep(5000);
		monthlist.selectByIndex(10);
		Thread.sleep(5000);
		yearlist.selectByIndex(53);
		Thread.sleep(5000);
		pavan.quit();

	}

}
