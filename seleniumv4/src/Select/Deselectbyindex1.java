package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectbyindex1 {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		WebElement dropdown=wd.findElement(By.id("products-orderby"));
		Select s=new Select(dropdown);
		s.selectByIndex(3);
		s.deselectByIndex(3);
	}
}
