package ItestListener;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Test extends Base_screen {
		@org.testng.annotations.Test
		public static void test() {
			String	before=wd.findElement(By.xpath("//a[text()='Register']")).getText();
			wd.findElement(By.xpath("//a[text()='Log in']")).click();
			wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("naag@gmail.com");
			wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("Naag@123");
			wd.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			String after=wd.findElement(By.xpath("//a[text()='naag@gmail.com']")).getText();
			Assert.assertEquals(before, after);
		}
}
