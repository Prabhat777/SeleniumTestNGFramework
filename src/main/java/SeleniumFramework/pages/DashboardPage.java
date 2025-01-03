package SeleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button//span[contains(text(), 'Flights')]")
	WebElement flightTab;
	
	public void clickOnFlightsTab() {
		flightTab.click();
	}
	
	@FindBy(xpath="//label[@for='one-way']")
	WebElement oneWay;
	
	public void clickOnOneWay() {
		oneWay.click();
	}
	
	@FindBy(xpath="//input[@name='from']")
	WebElement source;
	
	@FindBy(xpath="//button[contains(text(), 'BOM')]")
	WebElement selectSourceOption;
	
	public void enterSource() {
		source.clear();
		source.sendKeys("Mumbai");
		selectSourceOption.click();
	}
	
	@FindBy(xpath="//input[@name='to']")
	WebElement destination;
	
	@FindBy(xpath="//button[contains(text(), 'DEL')]")
	WebElement selectDestinationOption;
	
	public void enterDestination() {
		destination.clear();
		destination.sendKeys("Delhi");
		selectDestinationOption.click();
	}
	
	/*
	 * @FindBy(id="departure") WebElement departureDate;
	 * 
	 * @FindBy(xpath="//button[contains(text(), 'DEL')]") WebElement
	 * selectDestinationOption;
	 * 
	 * public void selectDepartureDate() { departureDate.click(); }
	 */
	
	
}
