package JavaScriptExicutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
//			wd.findElement(By.xpath("//a[text()='Facebook']")).click();
//			wd.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
			JavascriptExecutor je=(JavascriptExecutor)wd;
			je.executeScript("document.getElementsByName('custom_gender')[0].value='male'");
		}
}
