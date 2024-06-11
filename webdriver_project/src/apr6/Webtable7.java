package apr6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		WebElement webtable=driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row no"+i+"  "+"columns size::"+cols.size());
		}
      driver.quit();
	}

}
