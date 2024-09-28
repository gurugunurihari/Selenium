package seleniumv4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.instagram.com/");
		Thread.sleep(2000);
		wd.findElement(By.name("username")).sendKeys("syedsaddamhussain@gmail.com");
		wd.findElement(By.name("password")).sendKeys("Saddam@123");
		wd.findElement(By.className(" _acan _acap _acas _aj1- _ap30")).click();
	}
}
