package setup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class SetupTest {
	
	private WebDriver driver;
	
	@Test
	public void f() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void initializeFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/PeterJayCruz/Desktop/workspace/_libs/geckodriver");
		driver = new FirefoxDriver();
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
