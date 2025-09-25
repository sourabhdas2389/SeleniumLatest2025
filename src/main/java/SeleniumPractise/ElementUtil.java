package SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {

		if (value == null) {
			throw new ElementException("====Null values are not allowed in sendkeys method====");
		}
		getElement(locator).sendKeys(value);

	}

	public void doMultipleSendKeys(By locator, CharSequence... value) {

		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doElementGetText(By locator) {

		return getElement(locator).getText();

	}

	public boolean isElementDisplayed(By locator) {

		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not  displayed on page");
			e.printStackTrace();
			return false;
		}

	}

	public boolean isElementEnabled(By locator) {

		if (getElement(locator).isEnabled()) {
			return true;
		}
		return false;
	}

	public List<WebElement> getElements(By locator){
		
		return driver.findElements(locator);
	}
	
	//method to get the count of links available on page.this also returns links with no text
	public int getElementsCount(By locator) {
		
		return getElements(locator).size();
		
	}
	
	
	// method to get the text of all the links whose text is visible on DOM
	public List<String> getElementsTextList(By locator){
		
		List<WebElement> eleList = getElements(locator);
		List<String> elementTextList = new ArrayList<String>();
		
		for(WebElement e :eleList ) {
			
			String text = e.getText();
			if(text.length()!=0) {
				elementTextList.add(text);
			}
		}
		return elementTextList;
	}
	//better option of isElementDisplayed()
	public boolean isElementExists(By locator) {
		if(getElementsCount(locator)==1)
		{
			System.out.println("Element is presnt on page" + locator);
			return true;
		}
		else {
			System.out.println("Elment is not present on page" +locator);
			return false;
		}
	}
	
	//better option of isElementDisplayed() also works for elements which are present multiple times on page
	public boolean isElementExists(By locator , int expectedCount) {
		if(getElementsCount(locator)==expectedCount )
		{
			System.out.println("Element is presnt on page" + locator + "actual count" +expectedCount);
			return true;
		}
		else {
			System.out.println("Elment is not present on page" +locator);
			return false;
		}
	}
	
	public void clickElement(By locator,String elementText) {
		List <WebElement> elementList = getElements(locator);
		for(WebElement e : elementList) {
			String text = e.getText();
			if(text.contains(elementText) ) {
				e.click();
				break;
			}
		}
	}
	
	
	
	
}
