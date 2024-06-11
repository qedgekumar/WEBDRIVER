package dec4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//get row collection from table
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows in table::"+row);
		Thread.sleep(5000);
		//iterate all rows
		for(int i=1;i<rows.size();i++) {
			cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(500);
			System.out.println("row no."+i+" "+"columnsize::"+cols.size());
		}
     driver.quit();
	}

}
