package ui.accountpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ui.BasePage;

public class AccountPage extends BasePage {

	private static final String LOGIN_PAGE_URL = "https://www.phptravels.net/account/";

	private WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AccountPage navigateTo() {
		driver.get(LOGIN_PAGE_URL);
		return this;
	}

}
