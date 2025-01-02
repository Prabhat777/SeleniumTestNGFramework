package SeleniumFramework.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumFramework.pages.LoginPage;
import SeleniumFramework.pages.SignUpPage;

@Test
public class SignUpTest {
	
	public void signupSuccess() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		Thread.sleep(3000);
		
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
