package dec3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificwindow1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();
        ArrayList<String>var=new ArrayList<String>(driver.getWindowHandles());
        Thread.sleep(5000);
        driver.switchTo().window(var.get(3));
        String Expected ="Google account Help";
        String Actual = driver.getTitle();
        if (Expected.equalsIgnoreCase(Actual)) {
        	System.out.println("Title is matching::"+Expected+"  "+Actual);
			
		} else {
			System.out.println("Title is not matching::"+Expected+" "+Actual);

		}
       Thread.sleep(5000);
       driver.close();
       driver.switchTo().window(var.get(2));
       driver.findElement(By.linkText("Technologies")).click();
       Thread.sleep(5000);
       driver.close();
       driver.switchTo().window(var.get(1));
       driver.findElement(By.linkText("Privacy Policy")).click();
       Thread.sleep(5000);
       driver.close();
	}

}
