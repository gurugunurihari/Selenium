package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		Boolean b=wd.findElement(By.id("small")).isDisplayed();
		Boolean b1=wd.findElement(By.id("small-searchterms")).isEnabled();
		if (b) {
			if (b1) {
				wd.findElement(By.id("small-searchterms")).sendKeys("computer");
				Thread.sleep(2000);
				wd.findElement(By.className("button-1")).click();
			}
			else {
				System.out.println("not found");
			}
		}
		}
}
