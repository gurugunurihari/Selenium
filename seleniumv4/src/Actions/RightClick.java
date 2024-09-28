package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClick {
		public static void main(String[] args) {
			WebDriver wd= new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demo.guru99.com/test/simple_context_menu.html");
			WebElement button=wd.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			WebElement but=wd.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
			Actions a=new Actions(wd);
			//a.moveToElement(button).contextClick().build().perform();
			a.contextClick(button).build().perform();
			System.out.println(button.getText());
			System.out.println(but.getText());
			wd.quit();
		}
}
