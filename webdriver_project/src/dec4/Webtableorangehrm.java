package dec4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtableorangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions ac = new Actions(driver);
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//b[normalize-space()='Admin']"))).click().perform();
		Thread.sleep(5000);
		//ac.sendKeys(Keys.ARROW_DOWN).perform();
		//ac.pause(5000);
		//ac.sendKeys(Keys.ENTER).click().perform();
		//ac.pause(5000);
        WebElement  webtable = driver.findElement(By.id("resultTable"));
		List<WebElement>rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("no of rows in table::"+row);
		Thread.sleep(5000);
		for(int i=1;i<rows.size();i++) {
			cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(5000);
			System.out.println("row."+i+"  "+"columnsize::"+cols.size());
			
		}

	}

}
