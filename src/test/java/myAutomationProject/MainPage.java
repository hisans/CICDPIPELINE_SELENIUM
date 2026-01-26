package myAutomationProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author HisanS
 *
 */

public class MainPage {

WebDriver driver;

	
	By UserName = By.xpath(".//*[@id='UserName']");
	By Password = By.xpath(".//*[@id='Password']");
	By LoginButton = By.xpath(".//*[@id='loginForm']/form/div[4]/div/input");
	
	By OKButton = By.id("clear");
	By VerifyUserName = By.cssSelector("button[id =dropdownMenu1] span[class=name]");
	
	public MainPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LoginPagetestcase(String uid, String Pwd)
	{
		driver.findElement(UserName).sendKeys(uid);
		driver.findElement(Password).sendKeys(Pwd);
		driver.findElement(LoginButton).click();	
	}
	
	public void ClickOkfortheAlert() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(OKButton));
		
		driver.findElement(OKButton).click();
	}
	
	public String VerifyUserName()
	{
		return driver.findElement(VerifyUserName).getText();
	}
}
