package myAutomationProject;

import java.time.Duration;
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

	private WebDriver driver;

	// Locators using more efficient selectors
	private By userName = By.id("UserName");
	private By password = By.id("Password");
	private By loginButton = By.xpath("//input[@type='submit' or @type='button'][contains(@class,'btn') or @id='loginBtn']");
	
	private By okButton = By.id("clear");
	private By verifyUserName = By.cssSelector("button[id='dropdownMenu1'] span[class='name']");
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginPageTestCase(String uid, String pwd) {
		driver.findElement(userName).sendKeys(uid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
	
	public void clickOkForTheAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(okButton));
		
		element.click();
	}
	
	public String verifyUserName() {
		return driver.findElement(verifyUserName).getText();
	}
}
