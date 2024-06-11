package apr8;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificwindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(3));
		String Expected="Google Account Help";
		String Actual=driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("Title is matching"+Expected+"  "+Actual);
		}
		else
		{
			System.out.println("Title is not matching"+Expected+"   "+Actual);
		}
			Thread.sleep(5000);
			driver.close();
			driver.switchTo().window(brw.get(1));
			Thread.sleep(5000);
			driver.findElement(By.linkText("FAQ")).click();
			Thread.sleep(5000);
			driver.close();
		

	}

}
