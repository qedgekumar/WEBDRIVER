package march5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleandurl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String surl=driver.getCurrentUrl();
		System.out.println(surl);
		System.out.println(surl.length());
		driver.quit();
		
				

	}

}
