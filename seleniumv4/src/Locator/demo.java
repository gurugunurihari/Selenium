package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.amazon.in/");
			wd.findElement(By.cssSelector(".nav-a.nav-a-2.a-popover-trigger.a-declarative.nav-progressive-attribute")).click();
		}
}
