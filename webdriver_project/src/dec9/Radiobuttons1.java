package dec9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		List<WebElement>all_radiobuttons=driver.findElements(By.xpath("(//span[@class='_5k_2 _5dba'])"));
		System.out.println("no of radio buttons are::"+all_radiobuttons.size());
		for (WebElement each : all_radiobuttons) {
			System.out.println(each.getText());
			
		}
       driver.quit();
	}

}
