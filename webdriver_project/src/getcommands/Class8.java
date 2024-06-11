package getcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String visible_text=driver.findElement(By.linkText("Images")).getText();
		System.out.println(visible_text);
		String property_value=driver.findElement(By.partialLinkText("Ima")).getAttribute("href");
		System.out.println(property_value);
		driver.quit();
		

	}

}
