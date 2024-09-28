package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(2000);
			wd.quit();
		}
}
