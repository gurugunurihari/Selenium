package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			Thread.sleep(2000);
			wd.get("https://www.instagram.com/");
			String address=wd.getWindowHandle();
			System.out.println(address);
			wd.close();
		}
}
