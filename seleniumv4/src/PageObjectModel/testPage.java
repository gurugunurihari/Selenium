package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testPage  {


	@Test
	public void testcase() {
		WebDriver wd1=new ChromeDriver();
		wd1.manage().window().maximize();
		wd1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd1.get("https://demowebshop.tricentis.com/");
		HomePage hm=new HomePage(wd1);
		hm.getLoglink().click();
		loginPage lp=new loginPage(wd1);
		lp.login();
	}
}
