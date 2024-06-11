package apr7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethod {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		boolean is_Enabled=firstname.isEnabled();
		System.out.println(is_Enabled);
		WebElement re_enteremail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		Boolean is_displayed=re_enteremail.isDisplayed();
		System.out.println(is_displayed);
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='2']"));
		Boolean is_selected=radiobutton.isSelected();
		System.out.println(is_selected);
		driver.quit();
		

	}

}
