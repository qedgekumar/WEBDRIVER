package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validateloginmoduleorange {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement  username = driver.findElement(By.xpath("(//input[contains(@name,txt)])[6]"));
		username.clear();
		username.sendKeys("Admin");
		String Enteruser = username.getAttribute("value");
		WebElement password = driver.findElement(By.xpath("(//input[contains(@name,txt)])[7]"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String Enterpass=password.getAttribute("value");
		System.out.println(Enteruser+"  "+Enterpass);
		driver.findElement(By.xpath("(//input[contains(@name,txt)])[8]")).click();
		Thread.sleep(5000);
		String Expected = "Dashboard";
		String Actual =driver.getCurrentUrl();
		if (Actual.contains(Expected)) {
			System.out.println("login success::"+Expected+"  "+Actual);
			
			
		} else {
			String error_message=driver.findElement(By.xpath("(//span[contains(@id,ge)])[3]")).getText();
			System.out.println(error_message+"   "+Expected+"  "+Actual);

		}
		
		driver.quit();

	}

}
