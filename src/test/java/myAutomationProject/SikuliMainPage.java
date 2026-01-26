package myAutomationProject;

import java.io.File;

/**
 * SikuliMainPage class for UI automation using image recognition
 * 
 * NOTE: This class is currently disabled due to SikuliX dependency issues.
 * To enable Sikuli automation:
 * 1. Ensure SikuliX dependency is properly added to pom.xml
 * 2. Add the required image files to src/test/resources/sikuli-images/
 * 3. Uncomment the SikuliX imports and implementations below
 * 
 * @author HisanS
 */

public class SikuliMainPage {
	
	private String imagePath = "src/test/resources/sikuli-images/";
	
	// TODO: Uncomment when SikuliX dependency is properly configured
	// private Screen screen = new Screen();
	// private Pattern clickITM;
	// private Pattern typeUserName;
	// private Pattern typePassword;
	// private Pattern clickLoginButton;
	// private Pattern homePageLogo;
	// private Pattern loggedUserName;
	
	public SikuliMainPage() {
		// initializePatterns(); // TODO: Uncomment when SikuliX is available
		System.out.println("SikuliMainPage created - Sikuli functionality currently disabled");
		validateImageResources();
	}
	
	/**
	 * Initialize all image patterns
	 * TODO: Uncomment when SikuliX is available
	 */
	@SuppressWarnings("unused")
	private void initializePatterns() {
		/*
		try {
			clickITM = new Pattern(imagePath + "ITMAPP.png");
			typeUserName = new Pattern(imagePath + "TxtBox_UserName.png");
			typePassword = new Pattern(imagePath + "TxtBox_Password.png");
			clickLoginButton = new Pattern(imagePath + "btn_Login.png");
			homePageLogo = new Pattern(imagePath + "lbl_HomePageLogo.png");
			loggedUserName = new Pattern(imagePath + "lbl_LoggedUserName.png");
		} catch (Exception e) {
			System.err.println("Error initializing image patterns: " + e.getMessage());
			createDefaultPatterns();
		}
		*/
	}
	
	/**
	 * Create default patterns when images are not available
	 */
	@SuppressWarnings("unused")
	private void createDefaultPatterns() {
		System.out.println("Using default patterns - please add actual images to: " + imagePath);
	}

	/**
	 * Login to desktop ITM application using Sikuli automation
	 * Currently disabled - implement when SikuliX is properly configured
	 * 
	 * @param userName the username to enter
	 * @param password the password to enter
	 * @throws Exception if automation fails
	 */
	public void loginToDesktopITMApp(String userName, String password) throws Exception {
		System.out.println("SikuliMainPage.loginToDesktopITMApp() called with user: " + userName);
		System.out.println("Sikuli automation is currently disabled. To enable:");
		System.out.println("1. Add SikuliX dependency to pom.xml");
		System.out.println("2. Add required image files to: " + imagePath);
		System.out.println("3. Uncomment the implementation code");
		
		/*
		// TODO: Uncomment when SikuliX is available
		try {
			screen.setAutoWaitTimeout(10);
			
			// Wait for and double-click ITM application icon
			if (screen.exists(clickITM, 10) != null) {
				screen.doubleClick(clickITM);
			} else {
				throw new Exception("ITM Application icon not found");
			}
			
			// Enter username
			if (screen.exists(typeUserName, 10) != null) {
				screen.type(typeUserName, userName);
			} else {
				throw new Exception("Username field not found");
			}
			
			// Enter password
			if (screen.exists(typePassword, 5) != null) {
				screen.type(typePassword, password);
			} else {
				throw new Exception("Password field not found");
			}
			
			// Click login button
			if (screen.exists(clickLoginButton, 5) != null) {
				screen.click(clickLoginButton);
			} else {
				throw new Exception("Login button not found");
			}
			
			// Wait for home page to load
			if (screen.exists(homePageLogo, 15) == null) {
				throw new Exception("Home page did not load successfully");
			}
			
		} catch (Exception e) {
			System.err.println("Login failed: " + e.getMessage());
			throw e;
		}
		*/
	}
	/**
	 * Check if the logged user name element exists on the screen
	 * Currently disabled - implement when SikuliX is properly configured
	 * 
	 * @return true if the element exists, false otherwise
	 */
	public boolean isUserLoggedIn() {
		System.out.println("Checking login status (Sikuli disabled)");
		return false; // Default to false when Sikuli is disabled
		
		/*
		// TODO: Uncomment when SikuliX is available
		try {
			Match match = screen.exists(loggedUserName, 5);
			return match != null;
		} catch (Exception e) {
			System.err.println("Error checking login status: " + e.getMessage());
			return false;
		}
		*/
	}
	
	/**
	 * Get the text of the logged user name if visible
	 * Currently disabled - implement when SikuliX is properly configured
	 * 
	 * @return the user name text, or empty string if not found
	 */
	public String getLoggedUserName() {
		System.out.println("Getting logged user name (Sikuli disabled)");
		return ""; // Default to empty when Sikuli is disabled
		
		/*
		// TODO: Uncomment when SikuliX is available
		try {
			Match match = screen.exists(loggedUserName, 5);
			if (match != null) {
				return match.text();
			}
		} catch (Exception e) {
			System.err.println("Error getting logged user name: " + e.getMessage());
		}
		return "";
		*/
	}
	
	/**
	 * Check if all required image files exist
	 * @return true if all images exist, false otherwise
	 */
	public boolean validateImageResources() {
		String[] imageFiles = {
			"ITMAPP.png",
			"TxtBox_UserName.png",
			"TxtBox_Password.png",
			"btn_Login.png",
			"lbl_HomePageLogo.png",
			"lbl_LoggedUserName.png"
		};
		
		boolean allExist = true;
		for (String imageFile : imageFiles) {
			File file = new File(imagePath + imageFile);
			if (!file.exists()) {
				System.err.println("Missing image file: " + imageFile);
				allExist = false;
			}
		}
		
		if (!allExist) {
			System.err.println("Please add the required image files to: " + imagePath);
		}
		
		return allExist;
	}
}
