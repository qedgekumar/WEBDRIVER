package gmail;

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
		//print gmail id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window ids
		Set<String>all_wins=driver.getWindowHandles();
		System.out.println(all_wins);
		Thread.sleep(5000);
		for (String each : all_wins) {
			if (!parent.equals(each)) {
				Thread.sleep(5000);
		String pagetitle=driver.switchTo().window(each).getTitle();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		driver.close();
				
			}
			
		}
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("pavan.arisetti9");
		driver.quit();
		

	}

}
