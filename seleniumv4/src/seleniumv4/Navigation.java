package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.navigate().to("https://www.instagram.com/");
			Thread.sleep(2000);
			wd.navigate().to("https://www.facebook.com/");
			wd.navigate().back();
			Thread.sleep(2000);
			wd.navigate().forward();
			wd.navigate().refresh();
			System.out.println(wd.getTitle());
			System.out.println(wd.getCurrentUrl());
			System.out.println(wd.getWindowHandle());
			wd.quit();
		}
}
