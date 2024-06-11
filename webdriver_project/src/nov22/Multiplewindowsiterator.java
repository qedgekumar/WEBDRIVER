package nov22;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowsiterator {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		//click three links to open in new tabs
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
        Set<String>allwins=driver.getWindowHandles();
        System.out.println(allwins);
        Iterator<String>each=allwins.iterator();
        while (each.hasNext()) {
        	String child=each.next();
        	if (!parent.equals(child)) {
        String pagetitle = driver.switchTo().window(child).getTitle();
        System.out.println(pagetitle);
        Thread.sleep(5000);
        driver.close();
				
			}
			
		}
		//switch to parent
        String parenttitle=driver.switchTo().window(parent).getTitle();
        		System.out.println(parenttitle);
        Thread.sleep(5000);
        driver.close();
        
        

	}

}
