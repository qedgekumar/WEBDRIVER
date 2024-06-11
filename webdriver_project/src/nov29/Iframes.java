package nov29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//get collection of iframes in a webpage
		List<WebElement>all_frames=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+all_frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target);
		ac.release().build().perform();
		//switch back to main html page
		driver.switchTo().defaultContent();
		ac.pause(5000);
		//click on buttons link
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();

	}

}
