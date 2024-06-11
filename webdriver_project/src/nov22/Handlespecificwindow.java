package nov22;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlespecificwindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		//click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//store all windows into arraylist class
		ArrayList<String>brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to google account help window
		Thread.sleep(5000);
		driver.switchTo().window(brw.get(3));
		String Expected = "Google Account Help";
		String Actual = driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)){
			System.out.println("Title is matching::"+Expected+"  "+Actual);
			
			
		} else {
			System.out.println("Title is not matching::"+Expected+"   "+Actual);

		}
         Thread.sleep(5000);
         driver.close();
         //switch to google terms window
         driver.switchTo().window(brw.get(1));
         Thread.sleep(5000);
         driver.findElement(By.linkText("FAQ")).click();
         driver.close();
         //switch to google privacy window
         driver.switchTo().window(brw.get(2));
         Thread.sleep(5000);
         driver.findElement(By.linkText("Terms of Service")).click();
         driver.close();
         //switch to gmail
         driver.switchTo().window(brw.get(0));
         Thread.sleep(5000);
         driver.findElement(By.name("identifier")).sendKeys("pavan.arisetti");
         Thread.sleep(5000);
         driver.quit();
	}

}
