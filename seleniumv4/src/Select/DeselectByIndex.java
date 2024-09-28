package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://omayo.blogspot.com/");
			WebElement drop=wd.findElement(By.xpath("//select[@id='multiselect1']"));
			Select s=new Select(drop);
//			s.selectByIndex(1);
//			Thread.sleep(3000);
//			s.deselectByIndex(1);
//			Thread.sleep(3000);
			for (int i = 0; i <4; i++) {
				s.selectByIndex(i);
			}
			s.deselectAll();
//			s.selectByValue("volvox");
//			s.selectByValue("audix");
//			Thread.sleep(3000);
//			s.deselectByValue("audix");
			
		}
}
