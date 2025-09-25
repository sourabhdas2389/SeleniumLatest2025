package SeleniumPractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDompseudoElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String script = "return     getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')\r\n";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pseudo = js.executeScript(script).toString();
		
		System.out.println(pseudo);

	}

}
