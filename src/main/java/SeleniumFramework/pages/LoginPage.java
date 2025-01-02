package SeleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[contains(text(), 'Account')]")
	WebElement accountDropDown;
	
	public void clickAccountDropdown() {
		accountDropDown.click();
	}
	
	@FindBy(xpath="//strong[contains(text(), 'Login ')]")
	WebElement loginButton;
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	@FindBy(css="input[id='email']")
	WebElement email;
	
	public void enterEmail() {
		email.sendKeys("test@gmail.com");
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void enterPassword() {
		password.sendKeys("password@123");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	public void clickSubmitButton() {
		submitButton.click();
	}

}
