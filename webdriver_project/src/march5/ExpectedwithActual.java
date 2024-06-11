package march5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpectedwithActual {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Expected="google";
		String Actual=driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("Title is matching:"+Expected+"  "+Actual);
		}
		else
		{
			System.out.println("Title is not matching:"+Expected+"  "+Actual);
		}
		driver.quit();

	}

}
