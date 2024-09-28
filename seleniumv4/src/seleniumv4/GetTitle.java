package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://web.whatsapp.com/");
		String title=wd.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		wd.get("https://www.instagram.com/");
		String title1=wd.getTitle();
		System.out.println(title1);
	}
}
