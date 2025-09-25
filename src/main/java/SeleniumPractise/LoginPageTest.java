package SeleniumPractise;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		br.initDriver("Chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String appUrl= br.getCurrentPageurl();
		if (VerificationUtil.verifyContains(appUrl,"naveenautomationlabs")) {

			System.out.println("correct url opened");
		}
		String title = br.getPageTitle();
		VerificationUtil.verifyEquals(title, "Account Login");

		br.closeBrowser();

	}

}
