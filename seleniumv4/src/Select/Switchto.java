package Select;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("http://omayo.blogspot.com/");
			wd.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
			Set<String> s1=wd.getWindowHandles();
			for (String str : s1) {
				wd.switchTo().window(str);
				if (!wd.getCurrentUrl().contains("https://the-internet.herokuapp.com/windows/new")) {
					wd.close();
				}
			}
		}
}
