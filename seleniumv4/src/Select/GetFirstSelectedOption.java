package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://omayo.blogspot.com/");
			WebElement drop=wd.findElement(By.xpath("//select[@id='multiselect1']"));
			Select s=new Select(drop);
			s.selectByValue("swiftx");
			s.selectByValue("Hyundaix");
	WebElement option =	s.getFirstSelectedOption();
	System.out.println(	option.getText());
		wd.quit();
		}
}
