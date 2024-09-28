package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd= new ChromeDriver();
			wd.get("https://demowebshop.tricentis.com/");
			wd.manage().window().maximize();
			try {
				Boolean b=wd.findElement(By.id("small")).isDisplayed();
				if (b) {
					wd.findElement(By.id("small-searchterms")).sendKeys("mouse");
					Thread.sleep(3000);
					wd.findElement(By.className("button-1")).click();
				}
			
			} catch (Exception e) {
						System.out.println("not found");
			}
		
			Thread.sleep(3000);
			wd.quit();
		}
}
