package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://chercher.tech/practice/hidden-division-popup");
			wd.findElement(By.xpath("//input[@type='text']")).sendKeys("saddam");
		}
}
