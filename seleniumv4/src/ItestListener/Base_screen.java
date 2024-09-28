package ItestListener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(Listener.class)
public class Base_screen {
	public static WebDriver wd;
	@BeforeClass
	public void open() {
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demowebshop.tricentis.com/");
		
	}
	@AfterClass
	public void close() {
		wd.quit();
	}
	
}
