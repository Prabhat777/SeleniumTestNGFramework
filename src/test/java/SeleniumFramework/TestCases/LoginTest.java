package SeleniumFramework.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumFramework.TestComponents.BaseTest;
import SeleniumFramework.pages.LoginPage;

public class LoginTest extends BaseTest {
	WebDriver driver;

	@Test
	public void loginSuccess() throws InterruptedException, IOException {

		driver = initializeDriver();

		LoginPage login = new LoginPage(driver);

		login.clickAccountDropdown();
		login.clickLoginButton();
		login.enterEmail();
		login.enterPassword();
		login.clickSubmitButton();

	}

}
