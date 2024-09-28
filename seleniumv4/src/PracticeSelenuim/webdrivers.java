package PracticeSelenuim;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdrivers {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://omayo.blogspot.com/");
			WebElement drop = wd.findElement(By.xpath("//select[@id='multiselect1']"));
		Select s=new Select(drop);
		s.selectByIndex(0);
		//s.selectByValue("Hyundaix");
		s.selectByVisibleText("Hyundai");
		List<WebElement> d = s.getAllSelectedOptions();
				for (WebElement wt : d) {
					System.out.println(wt.getText());
				}
			}
}
