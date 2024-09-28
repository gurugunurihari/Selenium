package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectOption {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://omayo.blogspot.com/");
			WebElement drop=wd.findElement(By.xpath("//select[@id='multiselect1']"));
			Select s=new Select(drop);
			s.selectByValue("volvox");
			s.selectByValue("Hyundaix");
			List<WebElement> selected=s.getAllSelectedOptions();
			for (WebElement web : selected) {
				System.out.println(web.getText());
			}
			wd.quit();
		}
}
