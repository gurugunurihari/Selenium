package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autenticationpopup {
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			//WebDriverWait we=new WebDriverWait(wd, Duration.ofSeconds(20));
			wd.get("https://the-internet.herokuapp.com/basic_auth");
			Robot r=new Robot();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_D);
			r.keyPress(KeyEvent.VK_M);
			r.keyPress(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyPress(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_P);
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_S);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_M);
			r.keyRelease(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyRelease(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
}
