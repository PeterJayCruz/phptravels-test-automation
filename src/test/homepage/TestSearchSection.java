package homepage;

import org.testng.annotations.Test;

import setup.SetupTest;
import ui.HomePage;

public class TestSearchSection extends SetupTest {
	
	@Test
	public void firstTestMethod() {
		HomePage homePage = new HomePage(getDriver());

		homePage.navigateTo();
	}
}
