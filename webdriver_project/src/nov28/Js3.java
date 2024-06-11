package nov28;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://myntra.com'");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
