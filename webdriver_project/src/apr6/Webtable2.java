package apr6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Store table into web element
		WebElement webtable=driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//get rows collection from table
		rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("No of rows in a table::"+row);
		Thread.sleep(5000);
		//iterate all rows
		for(int i=0;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(5000);
			System.out.println("Row No"+i+"  "+"columnssize::"+cols.size());
			
		}
		driver.quit();
		

	}

}
