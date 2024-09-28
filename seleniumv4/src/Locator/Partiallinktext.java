package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {
	public static void main(String[] args) {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://amazon.in/");
		wd.findElement(By.partialLinkText("Service")).click();
	}
}
