package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	private static final String HOMEPAGE_URL = "https://www.phptravels.net/";
	
	private WebDriver driver;

	@FindBy(xpath = "//a[@href='#HOTELS']")
	private WebElement hotelsTab;

	@FindBy(xpath = "//a[@href='#flights']")
	private WebElement flightsTab;

	@FindBy(xpath = "//a[@href='#TOURS']")
	private WebElement toursTab;

	@FindBy(xpath = "//a[@href='#CARS']")
	private WebElement carsTab;

	@FindBy(xpath = "//a[@href='#VISA']")
	private WebElement visaTab;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTo(){
		driver.get(HOMEPAGE_URL);
	}
	
	public void clickHotelsTab() {
		hotelsTab.click();
	}

	public void clickFlightsTab() {
		flightsTab.click();
	}

	public void clickToursTab() {
		toursTab.click();
	}

	public void clickCarsTab() {
		carsTab.click();
	}
	public void clickVisaTab() {
		visaTab.click();
	}

}
