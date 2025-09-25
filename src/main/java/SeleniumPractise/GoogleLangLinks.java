package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		
		System.out.println(driver.findElements(langLinks).size());
		
		

	}

}
