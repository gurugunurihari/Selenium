package JavaScriptExicutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class removedisablebutton {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("http://omayo.blogspot.com/");
	WebElement we=wd.findElement(By.xpath("//button[@id='but1']"));
	JavascriptExecutor je=(JavascriptExecutor)wd;
			je.executeScript("arguments[0].removeAttribute('disabled');", we);
			Thread.sleep(3000);
			wd.quit();
		}
}
