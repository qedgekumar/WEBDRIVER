package dec10;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generalscreenshot {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//take screenshot and store into one variable
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy file to localsystem
		FileUtils.copyFile(screen, new File("C:\\Users\\pavan\\OneDrive\\Desktop\\kumarscreen.jpg"));
		driver.quit();
				
				
				
				
				
				
				
				

	}

}
