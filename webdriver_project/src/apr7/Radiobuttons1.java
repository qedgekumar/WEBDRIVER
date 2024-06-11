package apr7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("pranga82@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ranga123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement>all_radiobuttons=driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("No of radio buttons are"+all_radiobuttons.size());
		for(WebElement each:all_radiobuttons)
		{
			System.out.println(each.getText());
			Thread.sleep(5000);
		}
		driver.quit();
		

	}

}
