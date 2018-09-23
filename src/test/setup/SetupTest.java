package setup;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class SetupTest {

	private WebDriver driver;

	@BeforeMethod
	public void initializeFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/PeterJayCruz/Desktop/workspace/_libs/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void quitBrowser() {
		if(driver != null) {
			driver.quit();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
}
