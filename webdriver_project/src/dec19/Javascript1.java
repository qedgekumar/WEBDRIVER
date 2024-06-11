package dec19;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://myntra.com'");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String surl=js.executeScript("return document.URL").toString();
		System.out.println(surl);
		System.out.println(surl.length());
		String domainname=js.executeScript("return document.domain").toString();
		System.out.println(domainname);
		System.out.println(domainname.length());
		driver.quit();
		

	}

}
