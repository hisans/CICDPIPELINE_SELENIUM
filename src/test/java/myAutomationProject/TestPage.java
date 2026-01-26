package myAutomationProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// Note: ATU Reports imports commented out - uncomment if ATU dependency is added
// import atu.testng.reports.listeners.ATUReportsListener;
// import atu.testng.reports.listeners.ConfigurationListener;
// import atu.testng.reports.listeners.MethodListener;

/**
 * @author HisanS
 * 
 * Test class for automation scenarios
 * Updated to use Selenium 4 and modern WebDriver management
 */

// Note: ATU Reports listeners commented out - uncomment if ATU dependency is added
// @Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class TestPage {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		// Use WebDriverManager for automatic driver management
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	// ATU Reporter Configuration - uncomment if ATU dependency is added
	/*
	{
		String configPath = System.getProperty("user.dir") + "/ATUReports/ATUReporter_Selenium_testNG/atu.properties";
		System.setProperty("atu.reporter.config", configPath);
	}
	*/
	@Test
	public void testAveraEEDLoginPageVerification() throws Exception {
		// Create page objects
		MainPage login = new MainPage(driver);
		
		// Navigate to application
		driver.get(Data.URL);
		
		// Perform login
		login.loginPageTestCase(Data.UserName, Data.Password);
		
		// Optional: Handle alert if needed
		// login.clickOkForTheAlert();
		
		// Verify login success
		String actualUserName = login.verifyUserName();
		Assert.assertEquals(actualUserName, "System Administrator", 
			"The User Name of the logged user does not match expected value");
	}
	
	@Test
	public void testLoginToITMApplication() throws Exception {
		// Create Sikuli page objects
		SikuliMainPage mainpage = new SikuliMainPage();
		
		// Perform Sikuli-based login
		mainpage.loginToDesktopITMApp(SikuliDataPage.UName, SikuliDataPage.PW);
		
		// Verify login success
		boolean isLoggedIn = mainpage.isUserLoggedIn();
		Assert.assertTrue(isLoggedIn, "The logged user name is not displayed correctly");
	}
}
