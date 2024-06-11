package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmvalidatelogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement username = driver.findElement(By.xpath("(//input[starts-with(@name,tx)])[6]"));
        username.clear();
        username.sendKeys("Admin");
        String Enteruser = username.getAttribute("value");
        WebElement password = driver.findElement(By.xpath("(//input[starts-with(@name,tx)])[7]"));
        password.clear();
        password.sendKeys("Qedge123!@#");
        String Enterpass = password.getAttribute("value");
        driver.findElement(By.xpath("(//input[starts-with(@name,tx)])[8]")).click();
        System.out.println(Enteruser+"  "+Enterpass);
        String Expected = "Dashboard";
        String Actual   =driver.getCurrentUrl();
        if (Actual.contains(Expected)) {
        	System.out.println("Login success::"+Expected+"  "+Actual);
        	
			
		} else {
			String error_message = driver.findElement(By.xpath("(//span[starts-with(@id,sp)])[3]")).getText();
			System.out.println(error_message+" "+Expected+"  "+Actual);
			driver.quit();

		}
	}

}
