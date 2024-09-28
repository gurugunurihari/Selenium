package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("//a[@class='ico-login']")).click();
			wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("vasanth29@gmail.com");
			wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nishchala");
			wd.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			wd.quit();
		}
}
