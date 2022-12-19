package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase {

	@Test
	public void login() {
		

		// Initialize the page objects

		LoginPage login = new LoginPage(driver);
		login.getUsername().sendKeys(username);
		login.getPassword().sendKeys(password);
		login.loginBtn().click();
		Assert.assertTrue(driver.getTitle() != null);
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		System.out.println("Login Test Passed");
	}
}
