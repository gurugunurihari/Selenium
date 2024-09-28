package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			Dimension d=wd.findElement(By.id("small-searchterms")).getSize();
			int height=d.getHeight();
		    int weidth=	d.getWidth();
		    System.out.println(height);
		    System.out.println(weidth);
//			System.out.println(d.getHeight());
//			System.out.println(d.getWidth());
		}
}
