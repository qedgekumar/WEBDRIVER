package march5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginModule {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		String user=username.getAttribute("value");
		WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String pass=password.getAttribute("value");
		System.out.println(user+"  "+pass);
		WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
		login.click();
		Thread.sleep(5000);
		String Expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Login success"+Expected+" "+Actual);
		}
		else
		{
			//capture error message
			String Error_message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(Error_message+"   "+Expected+" "+Actual);
			
		}
		
		
		
		
		driver.quit();

	}

}
