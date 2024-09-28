package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssRegister {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.cssSelector(".ico-register")).click();
		wd.findElement(By.cssSelector("#gender-male")).click();
		wd.findElement(By.cssSelector(".text-box.single-line")).sendKeys("apshamkirkiri");
		wd.findElement(By.cssSelector("#LastName")).sendKeys("kaatraj");
		wd.findElement(By.cssSelector("#Email")).sendKeys("vasanth144@gmail.com");
		wd.findElement(By.cssSelector("#Password")).sendKeys("nischala");
		wd.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("nischala");
		wd.findElement(By.cssSelector("input[id='register-button']")).click();
		wd.close();
	}
}
