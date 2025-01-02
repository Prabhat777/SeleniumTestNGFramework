package SeleniumFramework.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumFramework.pages.LoginPage;

public class LoginTest {
	
	@Test
	public void loginSuccess() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		Thread.sleep(3000);
		
		LoginPage login = new LoginPage(driver);
		
		login.clickAccountDropdown();
		login.clickLoginButton();
		login.enterEmail();
		login.enterPassword();
		login.clickSubmitButton();
		
	}

}
