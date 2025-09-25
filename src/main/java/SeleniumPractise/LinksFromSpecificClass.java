package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksFromSpecificClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By rightPanel = By.className("list-group-item");
		
		/*
		 * List<WebElement> rightPanelLinks=driver.findElements(rightPanel);
		 * System.out.println(rightPanelLinks.size());
		 * 
		 * for(WebElement e : rightPanelLinks ) { String LinkTexts = e.getText();
		 * System.out.println(LinkTexts); }
		 */
		ElementUtil eleUtil= new ElementUtil(driver);
		List<WebElement> elementLis =eleUtil.getElements(rightPanel);
		int count = eleUtil.getElementsCount(rightPanel);
		
		if (count==13) {
			System.out.println("count is : "+ count + " Test case passed");
		}
		
		for(WebElement e : elementLis ) {
			System.out.println(e.getText());
		}
	}

}
