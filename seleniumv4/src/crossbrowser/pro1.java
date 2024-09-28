package crossbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class pro1 {
	static WebDriverWait wait;
	static WebDriver wd;
	static 
	@Parameters("browser")
	@BeforeClass
	public  void openbrowser(String browser) {
		if (browser.contains("chrome")) {
			wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			 wait=new WebDriverWait(wd,Duration.ofSeconds(15));
		}
		else if (browser.contains("firefox")) {
			 wd=new FirefoxDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
		}

	}
//	@BeforeMethod
//	public void login() {
//		wd.findElement(By.xpath("//a[@class='ico-login']")).click();
//		wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("sadsan29@gmail.com");
//		wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sania@29");
//		wd.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
//		}
	@AfterClass
	public void closingbrowser() {
		wd.quit();
	}
	
//	@AfterMethod
//	public void logout() {
//		wd.findElement(By.xpath("//a[@class='ico-logout']")).click();
//	}

}
