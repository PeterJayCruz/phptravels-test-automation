package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

  private static final String LOGIN_PAGE_URL = "https://www.phptravels.net/login";

  private WebDriver driver;

  @FindBy(name = "username")
  private WebElement emailTextField;

  @FindBy(name = "password")
  private WebElement passwordTextField;


  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public LoginPage navigateTo() {
    driver.get(LOGIN_PAGE_URL);
    return this;
  }

  public LoginPage enterEmail(String email) {
    enterTextIntoTextField(emailTextField, email);
    return this;
  }

  public LoginPage enterPassword(String password) {
    enterTextIntoTextField(passwordTextField, password);
    return this;
  }
}
