package dec2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleExpectedwithActual {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tatacliq.com");
		Thread.sleep(5000);
		String Expected = "tatacliq";
		String Actual = driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Title is matching::"+Expected+"  "+Actual);
			
		} else {
			System.out.println("Title is not matching::"+Expected+"  "+Actual);

		}
Thread.sleep(5000);
driver.quit();
	}

}
