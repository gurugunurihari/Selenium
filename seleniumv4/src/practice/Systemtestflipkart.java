package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Systemtestflipkart {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(wd,Duration.ofSeconds(10));
			WebDriverWait we=new WebDriverWait(wd, Duration.ofSeconds(10));
			wd.get("https://www.flipkart.com/");
			String parent = wd.getWindowHandle();
			WebElement element=wd.findElement(By.xpath("//span[text()='Fashion']"));
			Actions a=new Actions(wd);
			a.moveToElement(element).click().build().perform();
			wd.findElement(By.xpath("(//a[@class='_1BJVlg'])[1]")).click();
			Thread.sleep(3000);
	WebElement found=wd.findElement(By.xpath("//a[@title='Pack of 2 Men Printed Multicolor Track Pants']"));
			JavascriptExecutor js=(JavascriptExecutor)wd;
			js.executeScript("arguments[0].scrollIntoView(true);",found);
			found.click();
		Set<String> s=wd.getWindowHandles();
		s.remove(parent);
		Thread.sleep(3000);
		for (String str : s) {
			wd.switchTo().window(str);
			Thread.sleep(3000);
			WebElement scroll=wd.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
			JavascriptExecutor je=(JavascriptExecutor)wd;
			je.executeScript("arguments[0].scrollIntoView(true);",scroll);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")));
			scroll.click();
	//wd.close();//if we close child window means product is not adding.
		}
		Thread.sleep(3000);
		wd.switchTo().window(parent);
		Thread.sleep(3000);
		wd.findElement(By.xpath("//span[text()='Cart']")).click();
WebElement present=wd.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']"));
		if (present.isDisplayed()) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
		
		}
}
