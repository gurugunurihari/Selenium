package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
			WebElement search=wd.findElement(By.xpath("//input[@id='small-searchterms']"));
			Thread.sleep(3000);
			WebElement button=wd.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
			Thread.sleep(3000);
			Actions a=new Actions(wd);
			Thread.sleep(3000);
		//	a.moveToElement(search).click().sendKeys("laptop").moveToElement(button).click().build().perform();
			a.moveToElement(search).click().sendKeys("laptop").click(button).build().perform();
			Thread.sleep(3000);
			wd.quit();
		}
}
