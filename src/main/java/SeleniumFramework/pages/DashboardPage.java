package SeleniumFramework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//label[@for='round-trip']")
	WebElement roundTrip;
	
	public void clickOnRoundTrip() {
		roundTrip.click();
	}
	
	@FindBy(xpath="//input[@name='from']")
	WebElement source;
	
	@FindBy(xpath="//button[contains(text(), 'BOM')]")
	WebElement selectSourceOption;
	
	public void enterSource() {
		source.clear();
		source.sendKeys("BOM");
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", selectSourceOption);
	}
	
	@FindBy(xpath="//input[@name='to']")
	WebElement destination;
	
	@FindBy(xpath="//button[contains(text(), 'DEL')]")
	WebElement selectDestinationOption;
	
	public void enterDestination() {
		destination.clear();
		destination.sendKeys("DEL");
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", selectDestinationOption);
	}
	
	
	@FindBy(id = "departure")
	WebElement departureDate;

	@FindBy(xpath = "(//div[@class='datepicker-days']//th[@class='next'])[3]")
	WebElement nextButton;
	
	@FindBy(xpath = "(//td[@class='day ' and contains(text(), '20')])[3]")
	WebElement travelDate;

	public void selectDepartureDate() throws InterruptedException {
		departureDate.click();
		Thread.sleep(3000);
		nextButton.click();
		Thread.sleep(3000);
		travelDate.click();
	}
	
	@FindBy(id = "return_date")
	WebElement returnDate;
	
	public void selectReturnDate() throws InterruptedException {
		returnDate.click();
		Thread.sleep(3000);
		nextButton.click();
		Thread.sleep(3000);
		nextButton.click();
		travelDate.click();
	}
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement passengerCountDropdown;
	
	@FindBy(xpath = "(//div[@class='qtyInc'])[1]")
	WebElement adultsCountIncrement;
	
	@FindBy(xpath = "(//div[@class='qtyInc'])[2]")
	WebElement childCountIncrement;
	
	public void selectNumberOfPassengers() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", passengerCountDropdown);
        js.executeScript("arguments[0].click();", adultsCountIncrement);
        js.executeScript("arguments[0].click();", childCountIncrement);
	}
	
	@FindBy(xpath="//button[@id='flights-search']")
	WebElement searchButton;
	
	public void clickFlightSearch() {
		searchButton.click();
	}
	
	@FindBy(xpath="(//button[contains(text(), 'Select Flight')])[1]")
	WebElement selectFlightButton;
	
	public void clickSelectFlightButton() {
		selectFlightButton.click();
	}
	
	@FindBy(xpath = "//input[@name='user[first_name]']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='user[last_name]']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@name='user[email]")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='user[phone]")
	WebElement phone;
	
	@FindBy(xpath = "//input[@name='user[address]")
	WebElement address;
	
	public void enterPersonalInformation() {
		firstName.sendKeys("Prabhat");
		lastName.sendKeys("Singh");
		email.sendKeys("test@gmail.com");
		phone.sendKeys("9087654321");
		address.sendKeys("Testing Address for Personal Information");
	}
	
	@FindBy(xpath = "//input[@name='first_name_1']")
	WebElement adultTravler1FirstName;
	
	@FindBy(xpath = "//input[@name='user[last_name]']")
	WebElement adultTravler1LastName;
	
	@FindBy(xpath = "//select[@name='nationality_1']")
	WebElement adultTravler1Nationality;
	
	@FindBy(xpath = "//select[@name='dob_month_1']")
	WebElement adultTravler1dobmonth;
	
	@FindBy(xpath = "//select[@name='dob_day_1']")
	WebElement adultTravler1dobday;
	
	@FindBy(xpath = "//select[@name='dob_year_1']")
	WebElement adultTravler1dobyear;
	
	@FindBy(xpath = "//input[@name='passport_1']")
	WebElement adultTravler1passport;
	
	public void enterAdultTraveler1Information() {
		adultTravler1FirstName.sendKeys("Prabhat");
		adultTravler1LastName.sendKeys("Singh");
		adultTravler1passport.sendKeys("1009087654321");
		selectAdult1Nationality();
		selectAdult1DOBMonth();
		selectAdult1DOBDay();
		selectAdult1DOBYear();
	}
	
	public void selectAdult1Nationality(){
		Select sel = new Select(adultTravler1Nationality);
		sel.selectByValue("IN");
	}
	
	public void selectAdult1DOBMonth(){
		Select sel = new Select(adultTravler1dobmonth);
		sel.selectByValue("05");
	}
	
	public void selectAdult1DOBDay(){
		Select sel = new Select(adultTravler1dobday);
		sel.selectByValue("19");
	}
	
	public void selectAdult1DOBYear(){
		Select sel = new Select(adultTravler1dobyear);
		sel.selectByValue("1997");
	}

	
}
