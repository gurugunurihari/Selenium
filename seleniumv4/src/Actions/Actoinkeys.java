package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actoinkeys {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
		WebElement text=wd.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement cli=wd.findElement(By.xpath("//input[@value='Search']"));
		Actions a=new Actions(wd);
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("elinum").build().perform();
		a.moveToElement(cli).click().build().perform();
		Thread.sleep(5);
		wd.quit();
		}
}
