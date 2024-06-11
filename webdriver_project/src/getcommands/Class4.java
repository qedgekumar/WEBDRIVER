package getcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(5000);
		String Expected ="tatacliq";
		String Actual   =driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Title is matching::"+Expected+"     "+Actual);
			
			
		} else {
			System.out.println("Title is not matching::"+Expected+"     "+Actual);

		}
		
    driver.quit();
	}

}
