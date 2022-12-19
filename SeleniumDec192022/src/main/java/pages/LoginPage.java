package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='user-name']")
	private WebElement username;

	@FindBy(css = "input[name='password']")
	private WebElement password;

	@FindBy(css = "input[name='login-button']")
	private WebElement loginBtn;

	public WebElement getUsername() {

		return this.username;

	}

	public WebElement getPassword() {

		return this.password;
	}

	public WebElement loginBtn() {

		return this.loginBtn;
	}

}
