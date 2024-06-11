package nov18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listsoflinksinawebpage {

	public static void main(String[] args) throws Throwable {
		WebDriver pavan = new ChromeDriver();
		pavan.manage().window().maximize();
		pavan.manage().deleteAllCookies();
		pavan.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		//get collection of links which are stored into html tag a
		List<WebElement>all_links=pavan.findElements(By.tagName("a"));
		System.out.println("no of  links::"+all_links.size());
		Thread.sleep(5000);
		//print each link
		for (WebElement statement : all_links) {
			Thread.sleep(200);
			
			{
				
			}
			
			
		}
         Thread.sleep(5000);
         pavan.quit();
	}

    
}
