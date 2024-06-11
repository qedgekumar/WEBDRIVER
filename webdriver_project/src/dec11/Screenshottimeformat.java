package dec11;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshottimeformat {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://myntra.com");
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String datef = df.format(date);
		//take screenshot and store into one variable
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy file to localsystem
		FileUtils.copyFile(screen, new File("C:\\Users\\pavan\\OneDrive\\Desktop\\mrng/"+datef+"loginpage.jpg"));
	}

}
