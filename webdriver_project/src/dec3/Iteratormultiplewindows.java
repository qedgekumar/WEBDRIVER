package dec3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iteratormultiplewindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("(//a[contains(@href,ht)])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(@href,ht)])[3]")).click();
		driver.findElement(By.xpath("(//a[contains(@href,ht)])[4]")).click();
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		Iterator<String>each=allwins.iterator();
		while (each.hasNext()) {
			
			String child=each.next();
			if (!parent.equalsIgnoreCase(child)) {
	   String pagetitle = driver.switchTo().window(child).getTitle();
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
