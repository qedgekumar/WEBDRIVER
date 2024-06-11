package dec17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		List<WebElement>allframes=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are"+allframes.size());
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		//ac.dragAndDrop(source, target).perform();
		int y=target.getLocation().getY();
		int x=target.getLocation().getX();
		System.out.println(y+"  "+x);
		ac.dragAndDropBy(source, x, y).perform();

	}

}
