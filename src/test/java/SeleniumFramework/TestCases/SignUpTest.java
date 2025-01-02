package SeleniumFramework.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SignUpTest {
	
	public void signupSuccess() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//strong[contains(text(), 'Account')]")).click();
		driver.findElement(By.xpath("//strong[contains(text(), 'Signup ')]")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Prabhat");
		driver.findElement(By.id("last_name")).sendKeys("Singh");
		driver.findElement(By.id("phone")).sendKeys("9087654321");
		driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password@12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Select Country']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India ");
		driver.findElement(By.xpath("//span[contains(text(), 'India')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	

}
