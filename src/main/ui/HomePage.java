package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "")
	private WebElement hotelsTab;

	@FindBy(xpath = "")
	private WebElement flightsTab;

	@FindBy(xpath = "")
	private WebElement toursTab;

	@FindBy(xpath = "")
	private WebElement carsTab;

	@FindBy(xpath = "")
	private WebElement visaTab;

	public HomePage() {

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
