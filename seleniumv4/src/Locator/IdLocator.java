package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.facebook.com/");
		WebElement username=wd.findElement(By.id("email"));
		username.sendKeys("syedsaddamhussain31@gmail.com");
		WebElement password=wd.findElement(By.id("pass"));
		password.sendKeys("Saddam@123");
	}
}
