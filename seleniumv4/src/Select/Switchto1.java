package Select;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchto1 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			wd.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//a[text()='Facebook']")).click();
			Thread.sleep(2000);
		Set<String> s=wd.getWindowHandles();
		Thread.sleep(2000);
		for (String str : s) {
			wd.switchTo().window(str);
			Thread.sleep(2000);
			if (wd.getCurrentUrl().contains("https://www.facebook.com/nopCommerce")) {
				wd.findElement(By.xpath("//span[text()='Create New Account']")).click();
				Thread.sleep(2000);
				Set<String>s1=wd.getWindowHandles();
				Thread.sleep(2000);
				for (String string : s1) {
					wd.switchTo().window(string);
					if (wd.getCurrentUrl().contains("https://www.facebook.com/reg/?next=%2FnopCommerce")) {
						wd.findElement(By.xpath("//input[@type='text']")).sendKeys("syed");
						wd.findElement(By.xpath("//input[@name='lastname']")).sendKeys("saddam");
						wd.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("syedsaddamhussain151@gmail.com");
						wd.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Saddam123");
						WebElement drop=wd.findElement(By.id("day"));
						Select option=new Select(drop);
						option.selectByValue("15");
						WebElement drop1=wd.findElement(By.id("month"));
						Select option1=new Select(drop1);
						option1.selectByValue("4");
						
					}
				}
			}	
		}
		
		}
}
