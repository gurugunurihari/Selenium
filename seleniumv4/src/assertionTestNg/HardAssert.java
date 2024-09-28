package assertionTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {
		@Test
		public void testcase() {
			String url="https://demowebshop.tricentis.com/";
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get(url);
			String url1=wd.getCurrentUrl();
			org.testng.Assert.assertEquals(url, url1);
		}
		
}
