package assertionTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registervalidation {
		@Test
		public void testcase() {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			String	before=wd.findElement(By.xpath("//a[text()='Register']")).getText();
				wd.findElement(By.xpath("//a[text()='Log in']")).click();
				wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("naag@gmail.com");
				wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Naag@123");
				wd.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
				String after=wd.findElement(By.xpath("//a[text()='naag@gmail.com']")).getText();
				Assert.assertNotEquals(before, after);
		}
}
