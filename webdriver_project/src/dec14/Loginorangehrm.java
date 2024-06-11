package dec14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginorangehrm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		String Enteruser = username.getAttribute("value");
		WebElement password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String Enterpass=password.getAttribute("value");
		System.out.println(Enteruser+"  "+Enterpass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected)) {
			System.out.println("Login success"+Expected+"  "+Actual);
			
		} else {
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"  "+Expected+" "+Actual);
			

		}
		
		driver.quit();
		

	}

}
