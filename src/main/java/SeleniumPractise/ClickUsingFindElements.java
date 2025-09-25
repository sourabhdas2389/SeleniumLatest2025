package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingFindElements {
 
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By footerLinks = By.xpath("//footer//a");
		
		List<WebElement> eleList = driver.findElements(footerLinks);
		
		for(WebElement e :eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Contact Us")) {
				
				e.click();
				break;
			}
			
			
		}

	}

}
