package getcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(5000);
		//print title and length of the title
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of the title
		String url =driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(url.length());
		driver.quit();
		

	}

}
