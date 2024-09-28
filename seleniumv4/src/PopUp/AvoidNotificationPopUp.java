package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotificationPopUp {
		public static void main(String[] args) {
			ChromeOptions setting=new ChromeOptions();
			setting.addArguments("--disable-notifications");
			WebDriver wd=new ChromeDriver(setting);
			wd.manage().window().maximize();
			wd.get("https://www.easemytrip.com/");
			
		}
}
