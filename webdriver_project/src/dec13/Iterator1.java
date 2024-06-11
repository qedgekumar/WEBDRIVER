package dec13;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		Iterator<String>each=allwins.iterator();
		while (each.hasNext()) {
			String child = each.next();
			if (!parent.equals(child)) {
				String pagetitle = driver.switchTo().window(child).getTitle();
				System.out.println(pagetitle);
				driver.close();
				
			}
				
			
			
			
		}
		String pagetitle = driver.switchTo().window(parent).getTitle();
		System.out.println(pagetitle);
		driver.quit();

	}

}
