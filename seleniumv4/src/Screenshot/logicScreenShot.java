package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class logicScreenShot {
		 static WebDriver wd;
		 static WebElement we;
	
	public static void main(String[] args) throws IOException {
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demowebshop.tricentis.com/");
		screenshot();
	 we=wd.findElement(By.xpath("//input[@id='small-searchterms']"));
		screenShotWebElement();
	}

	public static void screenShotWebElement() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)wd;
	File source=we.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\\\Users\\\\syed saddam hussain\\\\OneDrive\\\\Desktop\\\\final mock\\\\seleniumv4\\\\takescreenshot\\\\loog.png");
	Files.copy(source, destination);
	}

	public static void screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)wd;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\syed saddam hussain\\OneDrive\\Desktop\\final mock\\seleniumv4\\takescreenshot\\log.png");
		Files.copy(source, destination);
		return;
	}
}
