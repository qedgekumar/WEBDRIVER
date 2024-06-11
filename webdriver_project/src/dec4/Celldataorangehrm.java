package dec4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Celldataorangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
        ac.moveToElement(driver.findElement(By.xpath("//b[normalize-space()='Admin']"))).click().perform();
        Thread.sleep(5000);
        WebElement webtable=driver.findElement(By.id("resultTable"));
        List<WebElement>rows,cols;
        rows=webtable.findElements(By.tagName("tr"));
        Thread.sleep(5000);
        int row = rows.size()-1;
        System.out.println("no of rows:"+row);
        for (WebElement eachrow : rows) {
        	cols=eachrow.findElements(By.tagName("td"));
        	for (WebElement each : cols) {
        		String celldata=each.getText();
        		System.out.println(celldata);
        		
				
			}
			System.out.println("===============");
		}
        Thread.sleep(5000);
        driver.quit();
	}

}
