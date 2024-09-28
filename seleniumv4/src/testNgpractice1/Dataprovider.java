package testNgpractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
		@DataProvider(name="user")
		public Object[][] testdata(){
			Object[][] d=new Object[2][4];
			d[0][0]="sad";
			d[0][1]="sam";
			d[0][2]="samm";
			d[0][3]="san";
			
			d[1][0]="sad";
			d[1][1]="sam";
			d[1][2]="samm";
			d[1][3]="san";
			return d;	
		}
		@Test(dataProvider = "user")
		public void test(String fn,String ln,String na,String wq) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.linkText("Register")).click();
			wd.findElement(By.id("FirstName")).sendKeys(fn);
			wd.findElement(By.id("LastName")).sendKeys(ln);
			wd.findElement(By.id("Email")).sendKeys(na);
			wd.findElement(By.id("Password")).sendKeys(wq);
		}
	}
