package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectbyValue {
	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		WebElement dropdown=wd.findElement(By.id("products-orderby"));
		Select s=new Select(dropdown);
		s.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=10");
	}
}
