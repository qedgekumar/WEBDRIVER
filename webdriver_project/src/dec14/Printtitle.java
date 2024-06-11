package dec14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printtitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tatacliq.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String stru1 = driver.getCurrentUrl();
		System.out.println(stru1);
		System.out.println(stru1.length());
		driver.quit();
        
	}

}
