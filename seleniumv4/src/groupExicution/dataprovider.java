package groupExicution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
		@Test(dataProvider = "credential")
		public void testcase(String fn,String ln,String em,String pass,String confpass) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://demowebshop.tricentis.com/");
			wd.findElement(By.linkText("Register")).click();
			wd.findElement(By.id("FirstName")).sendKeys(fn);
			wd.findElement(By.id("LastName")).sendKeys(ln);
			wd.findElement(By.id("Email")).sendKeys(em);
			wd.findElement(By.id("Password")).sendKeys(pass);
			wd.findElement(By.id("ConfirmPassword")).sendKeys(confpass);
		}
		@DataProvider(name="credential")
		public Object[][] testdata(){
			Object[][] d=new Object[2][5];	
			d[0][0]="syed";
			d[0][1]="saddam";
			d[0][2]="syedsaddam";
			d[0][3]="syedsan";
			d[0][4]="syedsan";
			
			d[1][0]="syed1";
			d[1][1]="saddam1";
			d[1][2]="syedsaddam1";
			d[1][3]="syedsan1";
			d[1][4]="syedsan1";
			
			
			
			return d;
			
		}
}
