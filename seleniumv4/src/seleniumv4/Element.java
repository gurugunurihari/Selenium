package seleniumv4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
public static void main(String[] args) {
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://demowebshop.tricentis.com/");
	wd.findElement(By.id("small-searchterms")).sendKeys("computer");
	wd.findElement(By.id("button-1 search-box-button")).click();
//	wd.get("https://www.google.co.in/webhp?tab=kw");
//	wd.findElement(By.id("APjFqb")).sendKeys("selinum");
//	wd.findElement(By.name("btnK")).click();
//	wd.get("https://www.facebook.com/");
//	WebElement username=wd.findElement(By.id("email"));
//	username.sendKeys("syedsaddamhussain31@gmail.com");
//	WebElement password=wd.findElement(By.id("pass"));
//	password.sendKeys("Saddam@123");
	wd.findElement(By.name("login")).click();
}
}
