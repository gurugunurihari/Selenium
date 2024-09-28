package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		wd.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("computer");
		wd.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
	}
}
