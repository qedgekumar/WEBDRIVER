package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//print gmail window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collections of all window ids
		Set<String>all_wins=driver.getWindowHandles();
		System.out.println(all_wins);
		for (String each : all_wins) {
			Thread.sleep(5000);
		//switch to child window when parent window id is not equal to child id
			if (!parent.equals(each)) {
		//switch to each child window and page titles
		String pagetitle=driver.switchTo().window(each).getTitle();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		driver.close();
				
			}
			
			
		}
		//switch to parent
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("pavan.arisetti");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
