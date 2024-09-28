package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextfunctionXpathRegister {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("//a[text()='Register']")).click();
			Thread.sleep(2000);
			wd.findElement(By.xpath("//input[@name='Gender']")).click();
			wd.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("naag");
			wd.findElement(By.xpath("//input[@name='LastName']")).sendKeys("JVM");
			wd.findElement(By.xpath("//input[@name='Email']")).sendKeys("naag@gmail.com");
			wd.findElement(By.xpath("//input[@name='Password']")).sendKeys("Naag@123");
			wd.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Naag@123");
			wd.findElement(By.xpath("//input[@name='register-button']")).click();
			wd.quit();
		}
}
