package SeleniumFramework.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumFramework.TestComponents.BaseTest;
import SeleniumFramework.pages.LoginPage;
import SeleniumFramework.pages.SignUpPage;

@Test
public class SignUpTest extends BaseTest{
	WebDriver driver;
	
	public void signupSuccess() throws InterruptedException, IOException {
		
		driver = initializeDriver();
		
		LoginPage login = new LoginPage(driver);
		SignUpPage register = new SignUpPage(driver);
		
		login.clickAccountDropdown();
		register.clickSignUpButton();
		register.enterFirstName();
		register.enterLastName();
		register.enterEmailId();
		register.selectCountry();
		register.enterContactNumber();
		login.enterPassword();
		register.clickCaptcha();
		login.clickSubmitButton();
		
		
	}
	
	
	
	

}
