package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(4000);
		//By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		
		List<WebElement> suggestionList=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(suggestionList.size());
		for(WebElement e : suggestionList ) {
			String text =e.getText();
		//	System.out.println(text);
			
			if(text.equals("selenium interview questions")) {
				e.click();
			    break;
			    }
			
		}
		
	}

}
