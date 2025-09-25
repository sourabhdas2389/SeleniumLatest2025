package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	private WebDriver driver;
	
	public BrowserUtil(WebDriver driver) {
		this.driver=driver;
	}
	public BrowserUtil() {
		
	}

	public WebDriver initDriver(String browserName) {

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Invalid browser- please pass correct browser" + browserName);
			throw new BrowserException("Invalid Browser");
		}
		return driver;

	}

	public void launchUrl(String url) {

		if (url == null) {

			throw new BrowserException("url needs to be given");
		}

		if (url.indexOf(url) != 0) {
			throw new BrowserException("Invalid url . http(s) is missing");
		}

		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getCurrentPageurl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
