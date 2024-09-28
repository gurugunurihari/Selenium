package testNgpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class enable {
	@Test(enabled = false)
	public void flip() {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.quit();
}
	@Test()
	public void amazon() {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		wd.quit();
	}
}
