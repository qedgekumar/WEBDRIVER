package nov29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[starts-with(text(),'Create new account')])")).click();
		Thread.sleep(5000);
       WebElement firstname=driver.findElement(By.xpath("(//input[contains(@placeholder,'First name')])"));
	   boolean is_Enabled = firstname.isEnabled();
	   System.out.println(is_Enabled);
	   WebElement reenteremail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	   boolean is_displayed=reenteremail.isDisplayed();
	   System.out.println(is_displayed);
	   WebElement radiobutton=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	   boolean is_selected=radiobutton.isSelected();
	   System.out.println(is_selected);
	   Thread.sleep(5000);
	   driver.quit();
	    
		

	}

}
