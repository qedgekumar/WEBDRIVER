package march5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Expected="https";
		String Actual=driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("Url is secured"+Expected+"  "+Actual);
		}
		else
		{
			System.out.println("Url is not secured"+Expected+"  "+Actual);
		}
		driver.quit();

	}

}
