package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.className("search-box-text")).sendKeys("saddam");
			Thread.sleep(3000);
			wd.findElement(By.className("search-box-text")).clear();
		}
}
