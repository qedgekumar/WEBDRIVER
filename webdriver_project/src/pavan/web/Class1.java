package pavan.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class1 {

	public static void main(String[] args) throws Throwable {
		
WebDriver  driver = new ChromeDriver();
WebDriver   driver1   = new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demoqa.com/login");
//driver.get("https://edge.com");
Thread.sleep(5000);
driver.quit();

	}

}
