package dec10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
	    List<WebElement>all_frames=driver.findElements(By.tagName("iframe"));
	    System.out.println("No of frames are::"+all_frames.size());
	    driver.switchTo().frame(0);
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target=driver.findElement(By.id("droppable"));
	    int y = target.getLocation().getY();
	    int x=target.getLocation().getX();
	    System.out.println(y+"  "+x);
	    ac.dragAndDropBy(source, x, y).perform();
	    
		

	}

}