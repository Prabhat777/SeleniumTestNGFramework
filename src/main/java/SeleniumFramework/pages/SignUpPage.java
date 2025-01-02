package SeleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[contains(text(), 'Signup ')]")
	WebElement registerButton;
	
	public void clickSignUpButton() {
		registerButton.click();
	}
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	public void enterFirstName() {
		firstName.sendKeys("Prabhat");
	}
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	public void enterLastName() {
		firstName.sendKeys("Singh");
	}
	
	@FindBy(id="phone")
	WebElement contactNumber;
	
	public void enterContactNumber() {
		contactNumber.sendKeys("9087654321");
	}
	
	@FindBy(id="user_email")
	WebElement emailId;
	
	public void enterEmailId() {
		contactNumber.sendKeys("prabhaatsingh87@gmail.com");
	}
	
	@FindBy(xpath="//button[@title='Select Country']")
	WebElement selectOptions;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchBox;
	
	@FindBy(xpath="//span[contains(text(), 'India')]")
	WebElement selectCountry;
	
	public void selectCountry() {
		selectOptions.click();
		searchBox.sendKeys("India");
		selectCountry.click();
	}
	
	@FindBy(id="//*[@id='recaptcha-anchor']")
	WebElement captchaCheckBox;
	
	public void clickCaptcha() {
		captchaCheckBox.click();
	}

}
