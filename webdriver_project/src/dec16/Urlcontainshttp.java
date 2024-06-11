package dec16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlcontainshttp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Expected = "https://";
		String Actual =driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured::"+Expected+"  "+Actual);
		}
		else
		{
			System.out.println("url is not secured::"+Expected+"  "+Actual);
		}
		driver.quit();

	}

}
