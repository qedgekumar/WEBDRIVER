package dec9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("no of rows in table::"+row);
		Thread.sleep(5000);
		for(int i=1;i<rows.size();i++) {
			cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(5000);
			System.out.println("row no."+i+"  "+"columnsize::"+cols.size());
					
			
		}
       driver.quit();
	}

}
