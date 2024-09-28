package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetlocInsta {
		public static void main(String[] args) {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.facebook.com/");
			Point p=wd.findElement(By.id("email")).getLocation();
			p.getX();
			p.getY();
			Point p1=wd.findElement(By.id("passContainer")).getLocation();
			p1.getX();
			p1.getY();
			System.out.println(p.getX());
			System.out.println(p1.getX());
			System.out.println(p.getY());
			System.out.println(p1.getY());
			if (p.getX()==p1.getX()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			wd.quit();
		}
}
