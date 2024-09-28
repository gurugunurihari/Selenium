package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesource {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.get("https://www.instagram.com/");
			String source_code=wd.getPageSource();
			System.out.println(source_code);
		}
}
