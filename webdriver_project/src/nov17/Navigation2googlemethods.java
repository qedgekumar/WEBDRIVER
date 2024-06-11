package nov17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation2googlemethods {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("https://www.google.co.in/");
	System.out.println("page title[1]"+driver.getTitle());
	Thread.sleep(5000);
	//click Images link
	driver.findElement(By.linkText("Images")).click();
	System.out.println("page title[2]"+driver.getTitle());
	Thread.sleep(5000);
	//click back button
	driver.navigate().back();
	System.out.println("page title[3]"+driver.getTitle());
	Thread.sleep(5000);
	//click forward button
	driver.navigate().forward();
	System.out.println("page title[4]"+driver.getTitle());
	Thread.sleep(5000);
	//click reload button
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.quit();
	

	}

}
