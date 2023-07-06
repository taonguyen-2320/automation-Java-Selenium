package tests.base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void initTest() {
		//TODO init and maximize browser
	}
	
	private void initDriver() {
		//TODO initDriver with dynamic browser type 
	}
	
	@AfterTest
	public void endTest() {
		//TODO take screenshot and quit browser
	}
}

