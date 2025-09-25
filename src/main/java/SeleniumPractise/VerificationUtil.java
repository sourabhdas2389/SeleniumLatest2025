package SeleniumPractise;

public class VerificationUtil {
	
	public static boolean verifyEquals(String actualValue , String expectedValue) {
		
		if(actualValue.equals(expectedValue)) {
			System.out.println(actualValue+" is equal to "+expectedValue);
			return true;
		}
		return false;
		
	}
	
public static boolean verifyContains(String actualValue , String expectedValue) {
		
		if(actualValue.contains(expectedValue)) {
			System.out.println(actualValue+" is contains "+expectedValue);
			return true;
		}
		return false;
		
	}

}
