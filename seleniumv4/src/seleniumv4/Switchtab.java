package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtab {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.instagram.com/");
			Thread.sleep(2000);
			wd.switchTo().newWindow(WindowType.TAB);
			wd.get("https://www.facebook.com/");
			wd.quit();
		}
}
