package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	@FindBy(xpath="")
	WebElement userName3;
	
	@FindBy(xpath="")
	WebElement userName4;
	
	@FindBy(xpath="")
	WebElement userName5;
	
	@FindBy(xpath="")
	WebElement userName6;
	
	public void enterUserName() {
		userName.sendKeys("yogesh");
		
	}
	
    public void enterPassword() {
		password.sendKeys("yogesh");
	}
	
    public void clickOnLogin() {
		loginButton.click();
	}
    
    public void enterUserName3() {
		
	}
    
    public void enterUserName4() {
		
	}
}
