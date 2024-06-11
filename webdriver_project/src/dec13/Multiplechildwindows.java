package dec13;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiplechildwindows {

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
		for (String each : allwins) {
			if (!parent.equals(each)) {
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				driver.close();
				}
		}
			
				driver.switchTo().window(parent);
				driver.findElement(By.name("identifier")).sendKeys("pavan.arisetti");
				driver.quit();
				
			}
			
		}

	

