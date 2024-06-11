package apr6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Celldata {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable=driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		for(WebElement eachrow:rows)
		{
			cols=eachrow.findElements(By.tagName("td"));
			for(WebElement eachcell:cols)
			{
				String celldata=eachcell.getText();
				System.out.println(celldata);
			}
			System.out.println("==================");
		}
		driver.quit();

	}

}
