package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click1 {
		public static void main(String[] args) {
			WebDriver wd =new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
		WebElement button=wd.findElement(By.xpath("//a[@class='ico-register']"));
		Actions a=new Actions(wd);
		a.moveToElement(button).click().build().perform();
		wd.quit();
		}
}
