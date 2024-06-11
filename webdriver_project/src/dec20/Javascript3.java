package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://jqueryui.com/'");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("Datepicker"));
		js.executeScript("document.scrollIntoview",element);
		element.click();
		Thread.sleep(5000);
		driver.quit();

	}

}
