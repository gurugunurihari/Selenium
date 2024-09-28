package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			String before=wd.findElement(By.linkText("Register")).getText();
			//for log in
			wd.findElement(By.linkText("Log in")).click();
			wd.findElement(By.className("email")).sendKeys("vasanth29@gmail.com");
			wd.findElement(By.className("password")).sendKeys("Nishchala");
			wd.findElement(By.className("login-button")).click();
			
			String after=wd.findElement(By.className("account")).getText();
			if (before.equalsIgnoreCase(after)) {
				System.out.println("not");
			} else {
				System.out.println("done");
			}
		}
}
