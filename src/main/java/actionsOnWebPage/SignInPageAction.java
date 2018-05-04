package actionsOnWebPage;

import org.openqa.selenium.By;
import actionsOnWebPage.XPaths;
import actionsOnWebPage.XPaths.signInPage;
public class SignInPageAction extends BaseTest {
	
	public static void clickOnSignIn() {
		driver.findElement(By.xpath(signInPage.signInButton)).click();
	}

}
