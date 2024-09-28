package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {
  public static void main(String[] args) {
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("http://omayo.blogspot.com/");
	WebElement drop=wd.findElement(By.xpath("//select[@id='multiselect1']"));
	Select s=new Select(drop);
	int length=s.getOptions().size();
	System.out.println(length);
	String value="volvo";
	for (int i = 0; i <length; i++) {
		s.selectByIndex(i);
	}
	s.deselectAll();
	List<WebElement> alloption=s.getOptions();
	for (WebElement w: alloption) {
		String s1 =w.getText();
		if (value.equalsIgnoreCase(s1)) {
			System.out.println("is there");
		}
		System.out.println(s1);
	}

}
}
