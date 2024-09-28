package testNgpractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver wd;
	@BeforeClass
	public void open() {
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() {
		wd.findElement(By.xpath("//a[contains(.,'Log')]")).click();
		wd.findElement(By.id("Email")).sendKeys("sadsan29@gmail.com");
		wd.findElement(By.id("Password")).sendKeys("Sania@29");
		wd.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@AfterMethod
	public void logout() {
		wd.findElement(By.className("ico-logout")).click();
	}
	@AfterClass
	public void close() {
		wd.quit();
	}
}
