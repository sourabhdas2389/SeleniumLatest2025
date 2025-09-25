package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
    //xpath //table[@class='ws-table-all']/tbody/tr[2]/td[1]
    
    String beforeXpath = "//table[@id='customers']/tbody/tr[";
    String afterXpath = "]/td[1]";
    
    int rowCount = driver.findElements(By.xpath("//table[@id='customers']/tbody//tr")).size();
    System.out.println(rowCount);
    
   for(int row=2;row<=rowCount;row++) {
    String text =driver.findElement(By.xpath(beforeXpath+row+afterXpath)).getText();
    System.out.println(text);
		
	}

	}
}
