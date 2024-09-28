package PracticeSelenuim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Actions a=new Actions(wd);
			wd.get("https://testkru.com/Interactions/DragAndDrop");
			WebElement drag = wd.findElement(By.xpath("(//div[@class='box'])[1]"));
			WebElement drop = wd.findElement(By.xpath("(//div[@id='dropZone1'])[1]"));
			a.dragAndDrop(drag, drop).perform();
		}
}
