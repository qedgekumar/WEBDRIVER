package nov22;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws Throwable {
		WebDriver pavan = new ChromeDriver();
		pavan.manage().window().maximize();
		pavan.manage().deleteAllCookies();
		pavan.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		String parent = pavan.getWindowHandle();
		System.out.println(parent);
		pavan.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		pavan.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		pavan.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		pavan.findElement(By.xpath("(//label[normalize-space()='E-CATERING'])[1]")).click();
		pavan.findElement(By.xpath("(//label[normalize-space()='HOLIDAY PACKAGES'])[1]")).click();
		pavan.findElement(By.xpath("(//label[normalize-space()='TOURIST TRAIN'])[1]")).click();
		pavan.findElement(By.xpath("(//label[normalize-space()='HILL RAILWAYS'])[1]")).click();
		pavan.findElement(By.xpath("(//label[normalize-space()='CHARTER TRAIN'])[1]")).click();


		Set<String>allwins=pavan.getWindowHandles();
		System.out.println(allwins);
		Iterator<String>kumar=allwins.iterator();
		while (kumar.hasNext()) {
			String child = kumar.next();
			if (!parent.equals(child)) {
				String pagetitle = pavan.switchTo().window(child).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				pavan.close();

			}
		}
			String parenttitle=pavan.switchTo().window(parent).getTitle();
			System.out.println(parenttitle);
			Thread.sleep(5000);
			pavan.quit();

		

	}

}
