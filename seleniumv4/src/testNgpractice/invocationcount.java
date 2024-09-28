package testNgpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount = 4)
	public void flip() {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.close();
	}
}
