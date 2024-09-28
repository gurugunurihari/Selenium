package testNgpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test extends Base {
		@org.testng.annotations.Test
		public void test() throws InterruptedException {
			Thread.sleep(3000);
			wd.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
			Thread.sleep(3000);
			wd.findElement(By.xpath("(//input[@type='button'])[2]")).click();
			Thread.sleep(3000);
			wd.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
			Thread.sleep(3000);
		}
		@org.testng.annotations.Test
		public void test1() {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")));
			wd.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
			wd.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			wd.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
			wd.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
			wd.findElement(By.xpath("(//input[@name='removefromcart'])[2]")).click();
			wd.findElement(By.xpath("(//input[@name='updatecart'])")).click();
		}
}
