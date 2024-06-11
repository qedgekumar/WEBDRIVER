package practiseseleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into webelement
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//clear text
		username.clear();
		//send value into the textbox
		username.sendKeys("Admin");
		//capture username value
		String Enteruser = username.getAttribute("value");
		//store password textbox into webelement
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//clear text
		password.clear();
		//sendvalue into   textbox
		password.sendKeys("Qedge123!@#");
		//capture password value
		String Enterpass = password.getAttribute("value");
		System.out.println(Enteruser+"    "+Enterpass);
		//click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected)) {
			System.out.println("Login success::"+Expected+"   "+Actual);
			
		} else {
			//capture error message
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"    "+Expected+"  "+Actual);
			driver.quit();

		}
		

	}

}
