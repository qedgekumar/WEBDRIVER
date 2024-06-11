package dec19;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascript2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(20));
		js.executeScript("window.location='https://amazon.in'");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	 
		js.executeScript("window.scrollBy(0,900)");
		driver.quit();

	}

}
