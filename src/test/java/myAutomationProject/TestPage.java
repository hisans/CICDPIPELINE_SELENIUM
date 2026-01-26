package myAutomationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.utils.Utils;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import myAutomationProject.MainPage;

/**
 * @author HisanS
 *
 */

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
	MethodListener.class })

public class TestPage {
	
	//Set Property for ATU Reporter Configuration
    {
      System.setProperty("atu.reporter.config",System.getProperty("user.dir")+"\\ATUReports\\ATUReporter_Selenium_testNG\\atu.properties");

    }
	@Test
	public void AveraEEDVerifyLoginPage() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    Data Datapage = new Data(driver);
	    MainPage login = new MainPage(driver);
	    
	    driver.get(Datapage.URL);
        login.LoginPagetestcase(Datapage.UserName, Datapage.Password);
        //login.ClickOkfortheAlert();
        
        Assert.assertEquals(login.VerifyUserName(), "System Administrator", "The User Name of the logged user does not show");
        driver.quit();
	}
	
	@Test
	public void LogintoITMApplication() throws Exception
	{
		
         SikuliMainPage mainpage = new SikuliMainPage();
         SikuliDataPage data = new SikuliDataPage();
         
         mainpage.LogintoDesktopITMAPP(data.UName, data.PW);
        
         Assert.assertTrue(mainpage.ensureExists(), "The logged user name is not displayed correctly");
	}
}
