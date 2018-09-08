package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage extends BasePage {


	private static final String HOTELS_PAGE_URL = "https://www.phptravels.net/hotels";

	private WebDriver driver;

	@FindBy(xpath = "//a[@href='#collapseMap']")
	private WebElement viewMapButton;

	@FindBy(css = "div[class*='search-button']")
	private WebElement searchButton;
	
	/*
	 * Filter section elements
	 */
	@FindBy(xpath = "//button[contains(text(),'Star Grade')]")
	private WebElement starGradeMenuButton;
	
	@FindBy(xpath = "//button[contains(text(),'Price Range')]")
	private WebElement priceRangeMenuButton;
	
	@FindBy(xpath = "//button[contains(text(),'Property Types')]")
	private WebElement propertyTypesMenuButton;
	
	@FindBy(xpath = "//button[contains(text(),'Amenities')]")
	private WebElement amenitiesMenuButton;

	@FindBy(id = "searchform")
	private WebElement filterSearchButton;
	
	
	public HotelsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTo() {
		driver.get(HOTELS_PAGE_URL);
	}

	public void clickViewMapButton() {
		clickElement(driver, viewMapButton);
	}

	public void clickSearchButton() {
		clickElement(driver, searchButton);
	}
	
	
	/*
	 * Filter section methods
	 */
	public void clickStarGradeMenuButton() {
		clickElement(driver, starGradeMenuButton);		
	}
	
	public void clickPriceRangeMenuButton() {
		clickElement(driver, priceRangeMenuButton);
	}
	
	public void clickPropertyTypesMenuButton() {
		clickElement(driver, propertyTypesMenuButton);
	}

	public void clickAmenitiesMenuButton() {
		clickElement(driver, amenitiesMenuButton);
	}
	
	public void clickFilterSearchButton() {
		clickElement(driver, filterSearchButton);
	}
}
