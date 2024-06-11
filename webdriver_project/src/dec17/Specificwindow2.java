package dec17;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificwindow2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window(brw.get(3));
		String Expected="Google Account Help";
		String Actual=driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Title is matching::"+Expected+" "+Actual);
			
		}
		else {
			System.out.println("Title is not matching::"+Expected+"  "+Actual);
		}
		Thread.sleep(5000);
		driver.close();
        driver.switchTo().window(brw.get(2));
        driver.findElement(By.linkText("FAQ")).click();
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(brw.get(1));
        driver.findElement(By.linkText("Technologies")).click();
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(brw.get(0));
        driver.findElement(By.name("identifier")).sendKeys("pavan");
        Thread.sleep(5000);
        driver.quit();
	}

}
