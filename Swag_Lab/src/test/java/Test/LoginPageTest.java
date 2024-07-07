package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import PageObject.LoginPageObject;
import Resource.BaseClass;

public class LoginPageTest extends BaseClass {

	WebDriver driver;
	LoginPageObject loginPage;
	
	@BeforeTest
	public void setup() throws IOException {
		driver = initialize();
	}
	
	@Test
	public void validateLogin() {
		loginPage = new LoginPageObject(driver);
		loginPage.enterUserName();
		loginPage.enterPassword();
		loginPage.clickOnLogin();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
