package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoIsdisplayed {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://omayo.blogspot.com/");
			Boolean b=wd.findElement(By.id("but1")).isDisplayed();
		Boolean b1	=wd.findElement(By.id("but1")).isEnabled();
			if (b) {
				if (b1) {
					wd.findElement(By.id("but1")).click();
				}
				else {
					System.out.println("not enabled");
				}
			}
			else {
				System.out.println("not displayed");
			}
		}
}
