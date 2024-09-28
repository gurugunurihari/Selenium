package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("//input[@value='Search']")).click();
			org.openqa.selenium.Alert a=wd.switchTo().alert();
			Thread.sleep(3000);
			System.out.println(a.getText());
			a.dismiss();
			wd.quit();
		}
}
