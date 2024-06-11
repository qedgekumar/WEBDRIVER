package dec1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofradiobuttons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("pranga82@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ranga123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		//get collection of radio buttons
		List<WebElement>all_radio=driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("no of radio buttons are::"+all_radio.size());
		for (WebElement each: all_radio) {
			System.out.println(each.getText());
			
			
		}
driver.quit();
	}

}
