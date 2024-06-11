package nov22;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctcspecificwindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//click three links
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(3));
		String Expected="Air Ticket Booking | Book Flight Tickets | Cheap Air Fare - IRCTC Air ";
		String Actual=driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Title is matching::"+Expected+"  "+Actual);
			
		} else {
			System.out.println("Title is not matching::"+Expected+"  "+Actual);

		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(brw.get(2));
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(brw.get(1));
		driver.findElement(By.linkText("Skip to main content")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(brw.get(0));
		driver.findElement(By.xpath("(//a[normalize-space()='LOGIN'])[1]")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
