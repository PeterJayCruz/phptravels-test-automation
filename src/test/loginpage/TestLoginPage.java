package loginpage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import setup.SetupTest;
import ui.loginpage.LoginPage;

public class TestLoginPage extends SetupTest {

	private final String VALID_EMAIL = "user@phptravels.com";
	private final String VALID_PASSWORD = "demouser";
	
	private final String INVALID_EMAIL = "invalid@email.com";
	private final String INVALID_PASSWORD = "invalidPassword";
	
	@DataProvider(name = "validLoginCredentials")
	public Object[][] validLoginCredentials() {
		return new Object[][] {
			{VALID_EMAIL, VALID_PASSWORD},
		};
	}
	
	@Test(dataProvider = "validLoginCredentials")
	public void testValidLogin(String email, String password) {
		LoginPage loginPage = new LoginPage(getDriver()).navigateTo();

		loginPage.loginWithValidCredentials(email, password);
	}

	@DataProvider(name = "invalidLoginCredentials")
	public Object[][] invalidLoginCredentials() {
		return new Object[][] {
			{INVALID_EMAIL, INVALID_PASSWORD},
			{VALID_EMAIL, INVALID_PASSWORD}
		};
	}
	
	@Test(dataProvider = "inValidLoginCredentials")
	public void testInvalidLogin(String email, String password) {
		LoginPage loginPage = new LoginPage(getDriver()).navigateTo();

		loginPage.loginWithInvalidCredentials(email, password);
	}
}
