package ui.hotelspage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ui.BasePage;

public class HotelsPage extends BasePage {

	private static final String HOTELS_PAGE_URL = "https://www.phptravels.net/hotels";

	private WebDriver driver;

	@FindBy(xpath = "//a[@href='#collapseMap']")
	private WebElement viewMapButton;

	/*
	 * *************************
	 * Search section elements
	 * *************************
	 */

	@FindBy(xpath = "//div[@class='select2-search']")
	private WebElement destinationTextBox;

	@FindBy(xpath ="//div[@class='datepicker dropdown-menu'][position()=1]//td[contains(@class,'day')]")
	private List<WebElement> checkInDatePickerDays;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][position()=1]//span[contains(@class,'month')]")
	private List<WebElement> checkInDatePickerMonths;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][position()=1]//span[contains(@class,'year')]")
	private List<WebElement> checkInDatePickerYears;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][position()=2]//td[contains(@class,'day')]")
	private List<WebElement> checkOutDatePickerDays;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][position()=2]//span[contains(@class,'month')]")
	private List<WebElement> checkOutDatePickerMonths;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][position()=2]//span[contains(@class,'year')]")
	private List<WebElement> checkOutDatePickerYears;

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

	@FindBy(css = "div[class*='search-button']")
	private WebElement searchButton;

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


	/*
	 * *************************
	 * Results grid section elements
	 * *************************
	 */
	@FindBy(xpath = "//table[contains(@class,'bgwhite')]//tr")
	private List<WebElement> resultsGridItemsList;


	public HotelsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HotelsPage navigateTo() {
		driver.get(HOTELS_PAGE_URL);
		return this;
	}

	public void clickViewMapButton() {
		clickElement(driver, viewMapButton);
	}


	/*
	 * *************************
	 * Search section methods
	 * *************************
	 */
	public void enterDestination(String destination) {

	}

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

	public HotelsPage filterResultsByStarGrade(StarGrades starGrade) {
		clickElement(driver, starGradeRadioButtonsList.get(starGrade.getIndex()));
		System.out.println("just clicked star grade button");
		clickElement(driver, filterSearchButton);
		System.out.println("just clicked search button");
		return this;
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

	/*
	 * *************************
	 * Results grid section methods
	 * *************************
	 */
	public List<Integer> getStarGradeOfAllResultsGridItems(StarGrades starGrade) {
		
		// filter list by given star grade
		filterResultsByStarGrade(starGrade);
		
		// wait for results grid to finish loading after filtering by star grade
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlToBe("https://www.phptravels.net/hotels/search/" + starGrade.getValue() + "/0/0/0"));
		
		// for each grid item element, get star grade
		ArrayList<Integer> starGrades = new ArrayList<>();
		for(WebElement gridItem : resultsGridItemsList) {
			starGrades.add(getStarGrade(gridItem));
		}
		
		return starGrades;
	}
	
	// helper method that returns an int that represents the number of stars
	// for the given results grid item	
	private int getStarGrade(WebElement gridItem) {
		List<WebElement> iTags = gridItem.findElements(By.xpath(".//i[contains(@class,'star')]"));
		
		int numStars = 0;
		for(WebElement i : iTags) {
			if(i.getAttribute("class").equals("star fa fa-star")) {
				numStars++;
			}
		}
		
		return numStars;
	}

}
