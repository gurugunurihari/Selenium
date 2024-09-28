package testNgpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethod {
		public static WebDriver wd;
		@Test
		public void register() {
			wd=new ChromeDriver();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("//a[@class='ico-register']")).click();
			wd.findElement(By.xpath("//input[@id='gender-male']")).click();
			wd.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sania");
			wd.findElement(By.xpath("//input[@id='LastName']")).sendKeys("farheen");
			wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("sadsan@gmail.com");
			wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sania@29");
			wd.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sania@29");
			wd.findElement(By.xpath("//input[@id='register-button']")).click();
		}
		@Test(dependsOnMethods="register")
		public void logout() {
			wd.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
		@Test(dependsOnMethods = "logout")
		public void login() {
			String before=wd.findElement(By.xpath("//a[@class='ico-register']")).getText();
			wd.findElement(By.xpath("//a[@class='ico-login']")).click();
			wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("sadsan@gmail.com");
			wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sania@29");
			wd.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			String after=wd.findElement(By.xpath("//a[text()='sadsan@gmail.com']")).getText();
			if (before.equalsIgnoreCase(after)) {
				Reporter.log("fail");
			} else {
					Reporter.log("pass");
			}
		}
		@Test(dependsOnMethods = "login")
		public  static void logout1() {
			wd.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
}
