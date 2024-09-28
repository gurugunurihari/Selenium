package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.instagram.com/");
			Thread.sleep(2000);
			wd.manage().window().minimize();
			System.out.println(wd.getCurrentUrl());
			wd.close();
		}
}
