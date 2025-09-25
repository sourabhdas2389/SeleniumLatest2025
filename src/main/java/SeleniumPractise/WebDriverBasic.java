package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("Test Passed");
			
		}
		
		else System.out.println("Test failed");
		
		
		driver.quit();
	}

}
