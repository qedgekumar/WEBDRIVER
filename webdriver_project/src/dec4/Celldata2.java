package dec4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Celldata2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement>rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("no of rows in table::"+row);
		for (WebElement eachrow : rows) {
			cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				String celldata=eachcell.getText();
				Thread.sleep(500);
				System.out.println(celldata);
				
				
				
			}
			System.out.println("===============");
			
		}
driver.quit();
	}

}
