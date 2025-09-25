package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
	
	
	
	public RegistrationPageTest() {
		
	}

	public static void main(String[] args) {
		
		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By privacyPolicyCheck = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By accountCreationMsg = By.tagName("h1");
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(br.getCurrentPageurl());
		if(VerificationUtil.verifyEquals(driver.getTitle(), "Register Account")) {
			
			System.out.println("title matches");
		}
		else
			System.out.println("Title does not match");
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doSendKeys(fName,"Sourabh");
		ele.doSendKeys(lName, "Das");
		ele.doSendKeys(telephone, "9100823423");
		ele.doSendKeys(email, "sourabh.das2389@gmail19.com");
		ele.doSendKeys(password, "Qwerty@123");
		ele.doSendKeys(confirmPassword, "Qwerty@123");
		ele.doClick(privacyPolicyCheck);
		ele.doClick(continueBtn);
		
		//Assertions
		
		/*
		 * if (driver.getCurrentUrl().contains("route=account/success")) {
		 * System.out.println("Test case 1 passed"); }
		 * if(driver.findElement(accountCreationMsg).getText().
		 * equals("Your Account Has Been Created!")) {
		 * System.out.println("Test case 2 passed"); }
		 * 
		 * driver.quit();
		 */
		System.out.println(br.getCurrentPageurl());
		if (br.getCurrentPageurl().contains("route=account/success")) {
			 System.out.println("Test case 1 passed"); }   
			 if(ele.getElement(accountCreationMsg).getText().
			 equals("Your Account Has Been Created!")) {
			 System.out.println("Test case 2 passed"); }
	}

}
