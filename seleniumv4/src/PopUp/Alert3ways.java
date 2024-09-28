package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3ways {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
			wd.findElement(By.xpath("//input[@id='simple']")).click();
			Alert a=wd.switchTo().alert();
			a.accept();
			Thread.sleep(3000);
			wd.findElement(By.xpath("//button[@id='confirm']")).click();
			Alert a1=wd.switchTo().alert();
			a1.accept();
			Thread.sleep(3000);
			wd.findElement(By.xpath("//button[@id='prompt']")).click();
			a.sendKeys("selinum");
			System.out.println(a.getText());
			a.accept();
			Thread.sleep(3000);
			WebElement we=wd.findElement(By.xpath("//div[@id='prompt_demo']"));
			System.out.println(we.getText());
			//wd.quit();
		}
}
