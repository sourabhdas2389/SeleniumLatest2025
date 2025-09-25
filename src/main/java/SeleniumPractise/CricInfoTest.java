package SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/men-s-t20-asia-cup-2025-1496919/afghanistan-vs-hong-kong-1st-match-group-b-1496920/full-scorecard");
		Thread.sleep(4000);

		String wicketTakerName = driver
				.findElement(By.xpath("//span[text()='Ibrahim Zadran']/ancestor::td/following-sibling::td//span/span"))
				.getText();
		System.out.println(wicketTakerName);

		// xpath - //span[text()='Ibrahim
		// Zadran']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]

		List<String> scoreCardList = scorecard("Ibrahim Zadran");
		System.out.println(scoreCardList);

	}

	public static List<String> scorecard(String playerName) {

		List<WebElement> scoreCard = driver.findElements(By.xpath("//span[text()='" + playerName
				+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> stringList = new ArrayList<String>();
		for (WebElement e : scoreCard) {
			String stringCard = e.getText();
			stringList.add(stringCard);
		}
		return stringList;
	}

}
