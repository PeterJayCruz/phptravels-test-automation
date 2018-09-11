package ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage extends BasePage {

	private static final String HOTELS_PAGE_URL = "https://www.phptravels.net/hotels";

	private WebDriver driver;

	/*
	 * *************************
	 * Search section elements
	 * *************************
	 */
	@FindBy(xpath = "//a[@href='#collapseMap']")
	private WebElement viewMapButton;

	@FindBy(css = "div[class*='search-button']")
	private WebElement searchButton;
	
	@FindBy(id = "travellersInput")
	private WebElement travellersInputTextbox;
	
	@FindBy(id = "adultPlusBtn")
	private WebElement adultPlusButton;
	
	@FindBy(id = "adultMinusBtn")
	private WebElement adultMinusButton;
	
	@FindBy(id = "childPlusBtn")
	private WebElement childPlusButton;
	
	@FindBy(id = "childMinusBtn")
	private WebElement childMinusButton;
	
	/*
	 * *************************
	 * Filter section elements
	 * *************************
	 */
	@FindBy(xpath = "//button[contains(text(),'Star Grade')]")
	private WebElement starGradeMenuButton;
	
	@FindBy(xpath = "//input[@name='stars']//following-sibling::ins")
	private List<WebElement> starGradeRadioButtonsList;
	
	@FindBy(xpath = "//button[contains(text(),'Price Range')]")
	private WebElement priceRangeMenuButton;
	
	@FindBy(xpath = "//button[contains(text(),'Property Types')]")
	private WebElement propertyTypesMenuButton;
	
	@FindBy(xpath = "//input[@name='type[]']//following-sibling::ins")
	private List<WebElement> propertyTypesCheckboxesList;
	
	@FindBy(xpath = "//button[contains(text(),'Amenities')]")
	private WebElement amenitiesMenuButton;

	@FindBy(xpath = "//input[@name='amenities[]']//following-sibling::ins")
	private List<WebElement> amenitiesCheckboxesList;
	
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

	
	/*
	 * *************************
	 * Search section methods
	 * *************************
	 */
	public void clickTravellersInput() {
		clickElement(driver, travellersInputTextbox);
	}
	
	public void clickAdultPlusButton() {
		clickElement(driver, adultPlusButton);
	}
	
	public void clickAdultMinusButton() {
		clickElement(driver, adultMinusButton);
	}
	
	public void clickChildPlusButton() {
		clickElement(driver, childPlusButton);
	}
	
	public void clickChildMinusButton() {
		clickElement(driver, childMinusButton);
	}
	
	public void clickSearchButton() {
		clickElement(driver, searchButton);
	}
	
	
	/*
	 * *************************
	 * Filter section methods
	 * *************************
	 */
	public void clickStarGradeMenuButton() {
		clickElement(driver, starGradeMenuButton);		
	}
	
	public void selectStarGrade(StarGrades starGrade) {
		clickElement(driver, starGradeRadioButtonsList.get(starGrade.getIndex()));
	}
	
	public void clickPriceRangeMenuButton() {
		clickElement(driver, priceRangeMenuButton);
	}
	
	public void clickPropertyTypesMenuButton() {
		clickElement(driver, propertyTypesMenuButton);
	}

	public void selectPropertyTypes(List<PropertyTypes> propertyTypes) {
		for(PropertyTypes propertyType : propertyTypes) {
			clickElement(driver, propertyTypesCheckboxesList.get(propertyType.getIndex()));
		}
	}
	
	public void clickAmenitiesMenuButton() {
		clickElement(driver, amenitiesMenuButton);
	}
	
	public void selectAmenities(List<Amenities> amenities) {
		for(Amenities amenity : amenities) {
			clickElement(driver, amenitiesCheckboxesList.get(amenity.getIndex()));
		}
	}
	
	public void clickFilterSearchButton() {
		clickElement(driver, filterSearchButton);
	}
}
