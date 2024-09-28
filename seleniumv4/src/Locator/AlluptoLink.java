package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlluptoLink {
public static void main(String[] args) throws InterruptedException {
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	wd.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	wd.navigate().back();
	Thread.sleep(2000);
	wd.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	wd.navigate().back();
	Thread.sleep(2000);
	wd.findElement(By.linkText("Shopping cart")).click();
}
}
