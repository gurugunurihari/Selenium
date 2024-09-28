package groupExicution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class group1  {
		@Test(groups = "Smoke")
		public void smoke() {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
		}
		@Test(groups="function")
		public void Fuction() {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.amazon.in/");
		}
		@Test(groups={"integration","function"})
		public void Integration() {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.flipkart.com/");
		}
}
