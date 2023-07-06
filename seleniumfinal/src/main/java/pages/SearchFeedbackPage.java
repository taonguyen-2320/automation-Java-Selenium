package pages;

import org.openqa.selenium.WebDriver;

public class SearchFeedbackPage extends BasePage{
	public SearchFeedbackPage(WebDriver driver) {
		super(driver, "/Feedbacks/SearchFull?pendingOnly=False");
	}
}
