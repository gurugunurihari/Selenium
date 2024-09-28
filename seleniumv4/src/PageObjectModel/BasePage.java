package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
		public BasePage(WebDriver wd) {
			PageFactory.initElements(wd, this);
		}
}
