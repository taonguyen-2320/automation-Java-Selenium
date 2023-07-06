package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	protected String path = "/";
	protected BasePage(WebDriver driver) {
		this.driver = driver;
	}
	//If the page has specific path, use this constructor
	protected BasePage(WebDriver driver, String path) {
		this.driver = driver;
		this.path = path;
	}
	public void goToURL() {
		//TODO read base URL from configuration -> concat with path -> go to that url
	}
	//TODO implement the common methods between pages
}
