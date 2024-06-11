package dec1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofradiobuttons2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();
		Thread.sleep(5000);
		//get collection of radiobuttons
		List<WebElement>all_radio=driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println("No of radio buttons are::"+all_radio.size());
		Thread.sleep(5000);
		for (WebElement each : all_radio) {
			System.out.println(each.getText());

		}
	
		driver.quit();
	}

}
