
package PracticeSelenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class flip {
	WebDriver wd;
	@Test
		public  void main() throws InterruptedException {
			 wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.flipkart.com/");
			Actions a=new Actions(wd);
			Thread.sleep(3000);
			WebElement fashion = wd.findElement(By.xpath("//span[text()='Fashion']"));
			a.moveToElement(fashion).perform();
			Thread.sleep(3000);
			WebElement bottom=wd.findElement(By.xpath("//a[contains(.,'Bottom')]"));
			Thread.sleep(3000);
			a.moveToElement(bottom).perform();
			List<WebElement> all = wd.findElements(By.xpath("//a[@class='_3490ry']"));
			for (WebElement web : all) {
				Thread.sleep(3000);
				a.moveToElement(web);
				System.out.println(web.getText());
			}
			
		}
	@AfterMethod
	public void cls() {
		wd.quit();
	}
}
