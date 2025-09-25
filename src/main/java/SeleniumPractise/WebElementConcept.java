package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
 
	
	 
	
	
	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.get(
		 * "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 */
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(email, "tom@gmail.com");
		System.out.println("printed email");
		ele.doSendKeys(password, "tom123");
		System.out.println("printed prasword");
		System.out.println("Printed oon the screen");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		br.closeBrowser();
		
	}

}
