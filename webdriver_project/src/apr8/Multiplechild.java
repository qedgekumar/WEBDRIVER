package apr8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplechild {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String>all_wins=driver.getWindowHandles();
		System.out.println(all_wins);
		for(String each:all_wins)
		{
			if(!parent.equals(each))
			{
				Thread.sleep(5000);
				String pagetitle=driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
			}
			
			
		}
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("pavan@");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
