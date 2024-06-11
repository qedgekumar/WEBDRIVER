package dec16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tatacliq.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String url =driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(url.length());
		driver.quit();

	}

}
