package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class searchscreenshot {
		public static void main(String[] args) throws IOException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://www.flipkart.com/");
			wd.findElement(By.xpath("//input[@name='q']")).sendKeys("toys");
			wd.findElement(By.xpath("//button[@class='_2iLD__']")).click();
			TakesScreenshot ts=(TakesScreenshot)wd;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\syed saddam hussain\\OneDrive\\Desktop\\final mock\\seleniumv4\\takescreenshot\\flip.png");
			Files.copy(source, destination);
			wd.quit();
		}
}
