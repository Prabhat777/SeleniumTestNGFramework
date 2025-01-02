package SeleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//strong[contains(text(), 'Signup ')]")
	WebElement registerButton;
	
	public void clickLoginButton() {
		registerButton.click();
	}

}
