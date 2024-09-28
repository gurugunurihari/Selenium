package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demo.guru99.com/test/simple_context_menu.html");
			WebElement button=wd.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
			Actions a=new Actions(wd);
		//	a.moveToElement(button).doubleClick().build().perform();
			a.doubleClick(button).build().perform();
			Thread.sleep(3000);
			wd.quit();
		}
}
