package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPdfLove {
		public static void main(String[] args) {
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd.get("https://www.ilovepdf.com/pdf_to_powerpoint");
			wd.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\\\Users\\\\syed saddam hussain\\\\OneDrive\\\\Desktop\\\\resumes\\\\syed saddam hussain auto resume.pdf");
		}
}
