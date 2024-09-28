package PracticeSelenuim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			Actions a=new Actions(wd);
			WebElement ele = wd.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
			a.moveToElement(ele).click().build().perform();
			a.doubleClick().perform();
			
		}
}
