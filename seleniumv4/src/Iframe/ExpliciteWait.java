package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {
	public static void main(String[] args) {
		WebDriver wd= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(wd, Duration.ofSeconds(15));
		wd.get("https://demowebshop.tricentis.com/");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Register']")));
		wd.findElement(By.xpath("//a[text()='Register']")).click();
		wd.quit();
	}
}
