package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
//			Thread.sleep(2000);
//			driver.get("https://www.shoppersstack.com/");
//			Thread.sleep(2000);
//			driver.get("https://web.whatsapp.com/");
//			driver.close();
	}

}
