package seleniumv4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
				driver= new ChromeDriver();
				Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		driver.get("https://www.shoppersstack.com/");
		driver.get("https://web.whatsapp.com/");
		driver.close();
		
	}

}
