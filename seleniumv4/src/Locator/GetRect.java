package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
		public static void main(String[] args) {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.instagram.com/");
			Rectangle r=wd.findElement(By.className("_aa4b")).getRect();
			//Rectangle r1=wd.findElement(By.name("password")).getRect();  //locator name is not there in insta inspect;
			System.out.println(r.getX());
			System.out.println(r.getY());
//			System.out.println(r1.getX());
//			System.out.println(r1.getY());
		}
}
