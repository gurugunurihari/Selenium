package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsswithId {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.cssSelector("#small-searchterms")).sendKeys("mouse");
			wd.findElement(By.cssSelector(".button-1.search-box-button")).click();
		}
}
