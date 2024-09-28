package Data_Driven_test.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pro1 {
		@Test
		public static void test() throws IOException, InterruptedException {
			FileInputStream fis=new FileInputStream("C:\\Users\\syed saddam hussain\\OneDrive\\Desktop\\final mock\\seleniumv4\\src\\Data_Driven_test\\data\\data.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String url=pro.getProperty("url");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get(url);
			wd.findElement(By.xpath("//a[@class='ico-login']")).click();
			String un=pro.getProperty("un");
			wd.findElement(By.xpath("//input[@class='email']")).sendKeys(un);
			Thread.sleep(3000);
			String pass=pro.getProperty("pass");
			wd.findElement(By.xpath("//input[@class='password']")).sendKeys(pass);
			Thread.sleep(3000);
			wd.quit();
		}
}
