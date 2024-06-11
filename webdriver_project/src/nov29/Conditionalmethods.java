package nov29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("(//a[starts-with(text(),'Create new account')])")).click();
		Thread.sleep(5000);
		//verify first name textbox is enabled or not
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		boolean is_Enabled = firstname.isEnabled();
		System.out.println(is_Enabled);
		//verify re enter email textbox is displayed or hidden
		WebElement reenteremail = driver.findElement(By.xpath("(//input[@name='reg_email_confirmation__'])"));
        boolean is_displayed = reenteremail.isDisplayed();
        System.out.println(is_displayed);
        //verify radiobutton is selected or not
        WebElement radiobutton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        boolean is_selected=radiobutton.isSelected();
        System.out.println(is_selected);
        driver.quit();
	}

}
