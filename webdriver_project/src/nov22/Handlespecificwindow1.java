package nov22;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlespecificwindow1 {

	public static void main(String[] args) throws Throwable {
		WebDriver pavan = new ChromeDriver();
		pavan.manage().window().maximize();
		pavan.manage().deleteAllCookies();
		pavan.get("http://gmail.com");
		Thread.sleep(5000);
		pavan.findElement(By.linkText("Help")).click();
		pavan.findElement(By.linkText("Privacy")).click();
		pavan.findElement(By.linkText("Terms")).click();
		ArrayList<String>p=new ArrayList<String>(pavan.getWindowHandles());
		pavan.switchTo().window(p.get(3));
		Thread.sleep(5000);
		String Expected = "Google Account Help";
		String Actual = pavan.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Title is matching"+Expected+"   "+Actual);
			
		} else {
			System.out.println("Title is not matching"+Expected+"   "+Actual);

		}
		Thread.sleep(5000);
		pavan.close();
		pavan.switchTo().window(p.get(1));
		pavan.findElement(By.linkText("Technologies")).click();
		Thread.sleep(5000);
		pavan.close();
		pavan.switchTo().window(p.get(2));
		pavan.findElement(By.linkText("FAQ")).click();
		Thread.sleep(5000);
		pavan.close();
		pavan.switchTo().window(p.get(0));
		pavan.findElement(By.name("identifier")).sendKeys("pavan.arisetti8");
		Thread.sleep(5000);
		pavan.quit();
		
		
		

	}

}
