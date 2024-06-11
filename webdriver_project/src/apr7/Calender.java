package apr7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Throwable {
		String doj="20/December/2030";
		String temp[]=doj.split("/");
		String date=temp[0];
		String month=temp[1];
		String year=temp[2];
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");
		Thread.sleep(5000);
		//click date picker
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		//click on date text box
		driver.findElement(By.id("datepicker")).click();
		//capture year and store
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!year.equals(calyear))
		{
			//click on next button
			driver.findElement(By.xpath("//span[.='Next']")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//capture month
		String calmonth=driver.findElement(By.className("ui-datepicker-calendar")).getText();
		while(!month.equals(calmonth))
		{
			//click next button
			driver.findElement(By.xpath("//span[.='Next']")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		WebElement webtable=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		for(WebElement eachrow:rows)
		{
			cols=eachrow.findElements(By.tagName("td"));
			for(WebElement eachcell:cols)
			{
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					eachcell.click();
					
				}
			}
		}
		

	}

}
