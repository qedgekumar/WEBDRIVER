package dec9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();
		Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		boolean is_enabled=firstname.isEnabled();
		System.out.println(is_enabled);
		WebElement reenteremail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean is_displayed=reenteremail.isDisplayed();
		System.out.println(is_displayed);
		WebElement radiobutton=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		boolean is_selected=radiobutton.isSelected();
		System.out.println(is_selected);
		driver.quit();
		
		

	}

}
