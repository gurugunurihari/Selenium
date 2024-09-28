package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTextXpath {
		public static void main(String[] args) {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			Boolean b=wd.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[3]")).isDisplayed();
			if (b) {
				System.out.println("displayed");
			} else {
				System.out.println("not displayedg");
			}
		}
}
