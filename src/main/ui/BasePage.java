package ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
  public void clickElement(WebDriver driver, WebElement element) {
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
  }

}
