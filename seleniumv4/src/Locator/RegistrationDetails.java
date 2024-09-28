package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationDetails {
			public static void main(String[] args) throws InterruptedException {
				WebDriver wd=new ChromeDriver();
				wd.manage().window().maximize();
				wd.get("https://demowebshop.tricentis.com/");
				wd.findElement(By.linkText("Register")).click();
				wd.findElement(By.id("gender-male")).click();
				Thread.sleep(2000);
				wd.findElement(By.id("FirstName")).sendKeys("Syed");
				Thread.sleep(1000);
				wd.findElement(By.id("LastName")).sendKeys("pavan");
				Thread.sleep(1000);
				wd.findElement(By.id("Email")).sendKeys("vasanth29@gmail.com");
				Thread.sleep(1000);
				wd.findElement(By.id("Password")).sendKeys("Nishchala");
				Thread.sleep(1000);
				wd.findElement(By.id("ConfirmPassword")).sendKeys("Nishchala");
				Thread.sleep(1000);
				wd.findElement(By.id("register-button")).click();
			}
}
