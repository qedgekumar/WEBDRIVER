package nov27;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.location='https://amazon.in'");
	Thread.sleep(5000);
	//scroll top to bottom vertically
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	js.executeScript("window.scrollTo(document.body.scrollHEIGHT,0)");
	Thread.sleep(5000);
	//scroll vertically to certain pixel
	js.executeScript("window.scrollBy(0,900)");
	Thread.sleep(5000);
	driver.quit();

	}

}
