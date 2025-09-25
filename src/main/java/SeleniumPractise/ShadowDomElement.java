package SeleniumPractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		String script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement wb=(WebElement)js.executeScript(script);
		wb.sendKeys("non veg pizza");

	}

}
