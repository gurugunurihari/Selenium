package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
		public static void main(String[] args) {
			WebDriver wd =new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			String s=wd.findElement(By.className("title")).getText();
			System.out.println(s);
			wd.close();
		}
}
