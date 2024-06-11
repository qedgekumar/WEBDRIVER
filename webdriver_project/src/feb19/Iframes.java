package feb19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
	List<WebElement>all_frames=driver.findElements(By.tagName("iframe"));
	System.out.println("No of frames are::"+all_frames.size());
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//iframe[@title='3rd party ad content'])[1]")).click();
	driver.quit();
	
	
	

	}

}
