package PopUp;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.easemytrip.com/");
			java.awt.Robot r=new java.awt.Robot();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
}
