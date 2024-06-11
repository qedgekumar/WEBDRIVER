package dec4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker1 {

	public static void main(String[] args) throws Throwable {
		String doj = "7-July-1991";
		String temp[]=doj.split("-");
		String date=temp[0];
		String month=temp[1];
		String year=temp[2];
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Datepicker")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!year.equals(calyear)) {
			driver.findElement(By.xpath("(//span[starts-with(@class,'ui')])[1]")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
      String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
      while (!month.equals(calmonth)) {
    	  driver.findElement(By.xpath("(//span[starts-with(@class,'ui')])[1]")).click();
    	  calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
    	  
		
	}
      WebElement webtable=driver.findElement(By.className("ui-datepicker-calendar"));
      List<WebElement>rows,cols;
      rows=webtable.findElements(By.tagName("tr"));
      for (WebElement eachrow: rows) {
    	  cols=eachrow.findElements(By.tagName("td"));
    	  for (WebElement eachcell : cols) {
    		  if (eachcell.getText().equals(date)) {
    			  Thread.sleep(5000);
    			  eachcell.click();
				
			}
			
		}
		
	}
	}

}
