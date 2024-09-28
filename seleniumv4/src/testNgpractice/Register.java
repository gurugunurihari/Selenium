package testNgpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
		public static WebDriver wd;
		@Test(priority=1)
		public void Resgister1() {
			wd=new ChromeDriver();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("//a[@class='ico-register']")).click();
			wd.findElement(By.xpath("//input[@id='gender-male']")).click();
			wd.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sania");
			wd.findElement(By.xpath("//input[@id='LastName']")).sendKeys("farheen");
			wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("sadsan29@gmail.com");
			wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sania@29");
			wd.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sania@29");
			wd.findElement(By.xpath("//input[@id='register-button']")).click();
		}
		@Test(priority=3)
		public void login() {
			wd.findElement(By.xpath("//a[@class='ico-login']")).click();
			wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("sadsan29@gmail.com");
			wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sania@29");
			wd.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		}
		@Test(priority=2)
		public void logout() {
			wd.findElement(By.xpath("//a[@class='ico-logout']")).click();
			
		}
}
