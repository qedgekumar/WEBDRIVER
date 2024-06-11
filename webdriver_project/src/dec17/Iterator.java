package dec17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		Set<String>allwins=driver.getWindowHandles();
		Thread.sleep(5000);
		java.util.Iterator<String>each=allwins.iterator();
		while (each.hasNext()) {
			String child=each.next();
			if (!parent.equals(child)) {
				String pagetitle=driver.switchTo().window(child).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
				
			}
			
		}
		String parenttitle =driver.switchTo().window(parent).getTitle();
		System.out.println(parenttitle);
		Thread.sleep(5000);
		driver.quit();

	}

}
