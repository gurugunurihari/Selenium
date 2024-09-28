package JavaScriptExicutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enable {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("http://omayo.blogspot.com/");
		JavascriptExecutor je=(JavascriptExecutor)wd;
		je.executeScript("document.getElementById('tb2').value='saddam'");
		}
}
