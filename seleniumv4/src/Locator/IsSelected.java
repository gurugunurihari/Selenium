package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(3000);
		Boolean b=wd.findElement(By.id("pollanswers-1")).isSelected();
		if (b) {
			System.out.println("is selected");
		} else {
			System.out.println("is not selected");
		}
		wd.quit();
	}
}
