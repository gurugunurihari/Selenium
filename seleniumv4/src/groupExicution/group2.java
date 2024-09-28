package groupExicution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class group2 {
	@Test(groups = "Smoke")
	public void smoke1() {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
	}
	@Test(groups="function1")
	public void Fuction1() {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
	}
	@Test(groups="integration1")
	public void Integration1() {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
	}
}
