package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
//		wd.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		wd.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("computer");
//		wd.findElement(By.cssSelector("input[type='submit']")).click();
		wd.get("https://www.amazon.in/");
		wd.findElement(By.cssSelector("input[type='text']")).sendKeys("mens shoes");
		wd.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	}
}
