package tests.feedback.search;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchFeedbackPage;
import tests.base.BaseTests;
import utils.FileReaders;

//This is just an example of how to use goToURL method, no need to implement this test
public class SearchAllFeedbackTests extends BaseTests{
	@Test
	public void searchAllFeedbackTest() {
		String testUsername = FileReaders.getConfigurationValue("...");
		String testPassword = FileReaders.getConfigurationValue("...");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goToURL();
		loginPage.openCredentialsTab()
			.enterCredentials(testUsername, testPassword)
			.clickOnLoginButton();
		SearchFeedbackPage searchFeedbackPage = new SearchFeedbackPage(driver);
		searchFeedbackPage.goToURL();
	}
}
