package dec1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttoncollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
        
        //get collection of checkboxes
        List<WebElement>All_check=driver.findElements(By.xpath("(//label[@class='css-label_c t_c'])"));
        System.out.println("No of check boxes are::"+All_check.size());
        for (WebElement each : All_check) {
        	System.out.println(each.getText());
			
		}
        driver.quit();
	}

}
