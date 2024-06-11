package apr6;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeanddatescreenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://facebook.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Date date=new Date();
	    DateFormat df=new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
	    String datef=df.format(date);
	    File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screen, new File("D:\\Screenshot\\"+datef+"pav.jpg"));
	    driver.quit();
	    
		

	}

}
