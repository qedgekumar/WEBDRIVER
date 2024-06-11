package dec14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printtitle1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
        System.out.println(url1.length());
        driver.quit();
	}

}
