package SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By countryLocator= By.xpath("//select[@id='Form_getForm_Country']");
	    WebElement country = getElement(countryLocator);
	    Select selectCountry = new Select(country);
	    Boolean flag = selectCountry.isMultiple();
	    System.out.println("first option is " +selectCountry.getFirstSelectedOption().getText()+" & iS multiple flage is "  + flag);
	    
	    doSelectByValue(countryLocator,"India");
	    
	    //getDropDownOptionsCount(countryLocator);
	    
	    System.out.println("All countries listed below");
	    
	  // List<String>  list = getDropDownOptionsList(countryLocator);
	 //  System.out.println(list);
	   // driver.get
	    
		}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	    
	}
  
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownOptionsList(By locator){
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("Total options in select tag are " +optionsList.size());
		
		List<String> optionsTextList = new ArrayList<String>();
		
		for(WebElement e : optionsList) {
			optionsTextList.add(e.getText());
		}
		return optionsTextList;
	}
	
	public static void doSelectByValue(By locator , String optionValue) {
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
			
				select.selectByValue(optionValue);
				
				
			
			
		}
	
	
}
