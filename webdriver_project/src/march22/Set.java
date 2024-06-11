package march22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String str=driver.findElement(By.tagName("section")).getText();
		
		String[] arr = str.split(" ");
		//System.out.println(Arrays.toString(arr));
		HashSet<String> hset = new HashSet<String>(Arrays.asList(arr));
		System.out.println(hset);
		driver.quit();

	}

}
