package nov28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Js8 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("(//input[contains(@name,'fi')])")).sendKeys("pavan");
        driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		new Select(driver.findElement(By.xpath("(//select[contains(@id,'mo')])"))).selectByIndex(06);
		driver.findElement(By.xpath("(//input[contains(@class,'wh')])[1]")).sendKeys("20");
		driver.findElement(By.xpath("(//input[contains(@class,'wh')])[2]")).sendKeys("32");
		new Select(driver.findElement(By.xpath("(//select[contains(@class,'UD')])[2]"))).selectByIndex(1);
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("(//input[contains(@class,wh)])")).sendKeys("pavan.arisetti2@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@class,wh)])[1]")).sendKeys("pavan@321");
		driver.findElement(By.xpath("(//input[contains(@class,wh)])[2]")).sendKeys("pavan@321");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("(//input[contains(@class,fm)])[1]")).sendKeys("7702248408");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'nd')])")).sendKeys("459968");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'re')])")).sendKeys("pavan.arisetti@gmail.com");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		
	}

}
