package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
		  Point p= wd.findElement(By.id("small-searchterms")).getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		wd.quit();
		}
}
