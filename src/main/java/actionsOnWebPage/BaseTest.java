package actionsOnWebPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	//@Before
	public static void initializeBrowser() {
		String currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("CWD : " + currentWorkingDirectory);
		System.setProperty("webdriver.chrome.driver", currentWorkingDirectory+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
	}
	
	//@After
	public static void closeBrowser() {
		driver.close();
	}

}
