package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage openCredentialsTab() {
		//TODO click Login By Credentials tab
		
		return this;
	}
	
	public LoginPage enterCredentials(String username, String password) {
		//TODO enter username and password
		
		return this;
	}
	
	public LoginPage clickOnLoginButton() {
		//TODO click Login button
		
		return this;
	}
}
