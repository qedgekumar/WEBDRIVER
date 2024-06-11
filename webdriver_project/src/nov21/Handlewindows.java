package nov21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//print gmail window id
		String parent = driver.getWindowHandle();
		System.out.println("parent");
		//click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window ids
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
		//switch to child window when parent id is not equal to child window id
			if (!parent.equals(each)) {
				Thread.sleep(5000);
		//switch to each child window and parent titles
		String pagetitle = driver.switchTo().window(each).getTitle();
		System.out.println(pagetitle);
		driver.close();
				
				
			}
			
		}
		//switch to parent
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("pavan.arisetti8");
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
