package PracticeSelenuim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popUp {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(wd, Duration.ofSeconds(20));
			wd.get("https://demoqa.com/alerts");
		WebElement si = wd.findElement(By.xpath("//button[@id='timerAlertButton']"));
		si.click();
		wait.until(ExpectedConditions.alertIsPresent());
		wd.switchTo().alert().accept();
		
		
			
		}
}
