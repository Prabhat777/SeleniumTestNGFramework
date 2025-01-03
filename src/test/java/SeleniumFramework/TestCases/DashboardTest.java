package SeleniumFramework.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumFramework.TestComponents.BaseTest;
import SeleniumFramework.pages.DashboardPage;
import SeleniumFramework.pages.LoginPage;
import SeleniumFramework.pages.SignUpPage;

public class DashboardTest extends BaseTest {
	WebDriver driver;

	@Test
	public void validateOneWayFlightBooking() throws InterruptedException, IOException {

		driver = initializeDriver();

		LoginPage login = new LoginPage(driver);
		SignUpPage register = new SignUpPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		
		dashboard.clickOnFlightsTab();
		dashboard.clickOnOneWay();
		dashboard.enterSource();
		dashboard.enterDestination();

		

	}

}
