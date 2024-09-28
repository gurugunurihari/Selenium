package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			String s=wd.findElement(By.name("q")).getAttribute("id");
			System.out.println(s);
			Thread.sleep(3000);
			wd.findElement(By.id(s)).sendKeys("iphone");
			Thread.sleep(3000);
			wd.quit();
		}
}
