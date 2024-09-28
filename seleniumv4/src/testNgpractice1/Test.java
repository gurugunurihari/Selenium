package testNgpractice1;

import org.openqa.selenium.By;

public class Test extends Base {
		@org.testng.annotations.Test
		public void test() {
			wd.findElement(By.xpath("(//a[contains(.,'Computers')])[1]")).click();
			wd.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
		}
}
