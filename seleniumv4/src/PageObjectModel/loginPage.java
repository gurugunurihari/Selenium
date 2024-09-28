package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage  extends BasePage{

	public loginPage(WebDriver wd) {
		super(wd);

	}
	
		@FindBy(xpath="//input[@id='Email']")
		private WebElement email;
		
		@FindBy(xpath="//input[@id='Password']")
		private WebElement password;
		
		@FindBy(xpath="(//input[@type='submit'])[2]")
		private WebElement loginbutton;
		
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}
		public void login() {
			getEmail().sendKeys("vasanth29@gmail.com");
			getPassword().sendKeys("Nishchala");
			getLoginbutton().click();
		}

}
