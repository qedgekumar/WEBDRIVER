package apr6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		//take screenshot and store into one variable
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy file to local system
		FileUtils.copyFile(screen, new File("D:\\Screenshot\\screen.jpg"));
		driver.quit();

	}

}
