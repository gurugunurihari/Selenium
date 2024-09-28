package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver wd) {
		super(wd);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loglink;
	@FindBy(xpath="//a[text()='Shopping cart']")
	private WebDriver shoplink;
	
	
	public WebElement getRegister() {
		return register;
	}
	public WebElement getLoglink() {
		return loglink;
	}
	public WebDriver getShoplink() {
		return shoplink;
	}
	
}
