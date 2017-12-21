package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import enums.Browser;

public class Driver {
	
	public WebDriver getDriver() {
		Browser browserToTest = Config.browser;
		WebDriver driver = null;
		switch (browserToTest) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "/Users/lyubovhrynenko/Documents/automationWorkspace3/automation2/src/test/java/resources/chromedriver");
			driver = new ChromeDriver();
			break;
		case SAFARI:
			System.setProperty("webdriver.safari.driver", "/Users/lyubovhrynenko/Documents/automationWorkspace3/automation2/src/test/java/resources/safaridriver");
			driver = new SafariDriver();
		default:
			System.out.println("Currently we do not support this browser" + browserToTest);
			break;
		}
		if (driver != null) {
			driver.manage().window().maximize();
		}
		return driver;
	}

}
