package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			String s=wd.findElement(By.className("ico-login")).getCssValue("color");
			System.out.println(s);
			wd.get("https://colorcodefinder.com/rgb-to-hex?input=rgba%28175%2C+3%2C+4%2C+1%29");
			Thread.sleep(2000);
			wd.findElement(By.id("hex")).clear();
			Thread.sleep(2000);
			wd.findElement(By.id("hex")).sendKeys(s);
			Thread.sleep(2000);
			wd.findElement(By.cssSelector("button[type='submit']")).submit();
			
		}
}
