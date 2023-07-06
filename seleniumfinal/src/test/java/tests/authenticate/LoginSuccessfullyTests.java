package tests.authenticate;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import data.Constants;
import pages.LoginPage;
import tests.base.BaseTests;
import utils.FileReaders;

public class LoginSuccessfullyTests extends BaseTests {

	@Test
	public void loginSuccessfully() throws IOException {
		//TODO replace the "..." with data in test data file
		String testUsername = FileReaders.getConfigurationValue("...");
		String testPassword = FileReaders.getConfigurationValue("...");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goToURL();
		loginPage.openCredentialsTab()
			.enterCredentials(testUsername, testPassword)
			.clickOnLoginButton();
		
		String pageTitle = driver.getTitle();
		assertEquals(pageTitle, Constants.HOME_TITLE);
	}
}
