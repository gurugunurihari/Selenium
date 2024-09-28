package testNgpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class threadpoolsize {
	@Test(invocationCount = 10,threadPoolSize = 2)
	public void flip() {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.quit();
}
}
