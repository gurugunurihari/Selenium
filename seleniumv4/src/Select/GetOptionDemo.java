package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionDemo {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
			WebElement dropdown=wd.findElement(By.id("products-orderby"));
			Select s=new Select(dropdown);
			int length=s.getOptions().size();
			List<WebElement> alloption=s.getOptions();
			for (int i = 0; i <s.getOptions().size(); i++) {
					String s2=alloption.get(i).getText();
					System.out.println(s2);
			}
			
		}
}
