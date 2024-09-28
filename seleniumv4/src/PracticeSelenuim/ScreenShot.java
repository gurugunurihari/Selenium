package PracticeSelenuim;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
		public static void main(String[] args) throws IOException {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			TakesScreenshot ts= (TakesScreenshot) wd;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\syed saddam hussain\\OneDrive\\Desktop\\final mock\\seleniumv4\\takescreenshot\\sad.png");
			Files.copy(source, dest);
		}
}
