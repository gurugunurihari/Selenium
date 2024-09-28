package testNgpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program2 {
		@Test(priority=1)
		public void flip() {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			wd.get("https://www.flipkart.com/");
		}
		@Test(priority=2)
		public void amzaon() {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			wd.get("https://www.amazon.in/");
		}
}
