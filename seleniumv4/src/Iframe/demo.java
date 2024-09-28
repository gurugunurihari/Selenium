package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	WebElement ele=wd.findElement(By.xpath("//iframe[@class='w-full h-96']"));
			wd.switchTo().frame(ele);
			wd.findElement(By.xpath("//input[@id='email']")).sendKeys("syed");
			wd.findElement(By.xpath("//input[@id='password']")).sendKeys("saddam");
			wd.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("saddam");
			
			wd.switchTo().parentFrame();
			
			WebElement ele1=wd.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
			wd.switchTo().frame(ele1);
			wd.findElement(By.xpath("//input[@id='username']")).sendKeys("syed");
			wd.findElement(By.xpath("//input[@id='password']")).sendKeys("saddam");
		}
}
