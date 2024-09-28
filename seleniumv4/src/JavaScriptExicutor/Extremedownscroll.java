package JavaScriptExicutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extremedownscroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.amazon.in/");
	JavascriptExecutor je=(JavascriptExecutor)wd;
	je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	je.executeScript("window.scrollTo(0,document.body.scrollTop)");
	Thread.sleep(3000);
	wd.quit();
	}
}
