package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class defaultcontaint {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://www.dream11.com/");
			wd.switchTo().frame("send-sms-iframe");
			wd.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("saddam");
			wd.switchTo().defaultContent();
           wd.findElement(By.xpath("//div[@id='select-selected']")).click();
			wd.findElement(By.id("hindi")).click();
			Thread.sleep(3000);
			wd.quit();
		}
}
