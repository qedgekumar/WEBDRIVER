package dec10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https:myntra.com'");
		Thread.sleep(5000);
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String domainname = js.executeScript("return document.domain").toString();
		System.out.println(domainname);
		System.out.println(domainname.length());
		String strurl = js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.quit();
		

	}

}
