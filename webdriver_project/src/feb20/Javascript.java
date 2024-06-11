package feb20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.flipkart.com'");
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String url=js.executeScript("return document.URL").toString();
		System.out.println(url);
		System.out.println(url.length());
	
		String domainname=js.executeScript("return document.domain" ).toString();
		System.out.println(domainname);
		System.out.println(domainname.length());
		driver.quit();

	}

}
