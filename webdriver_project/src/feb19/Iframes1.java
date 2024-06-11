package feb19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>all_frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+all_frames.size());
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pavan8");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Select listbox = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		listbox.selectByIndex(2);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@id='head'])[1]")).click();
		
		
		
		
		
		
		
		driver.quit();

	}

}
