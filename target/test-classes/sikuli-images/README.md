# Sikuli Image Resources

This directory is intended to store image files for Sikuli UI automation.

## Required Image Files

To enable Sikuli functionality in `SikuliMainPage.java`, add the following image files:

1. `ITMAPP.png` - ITM application icon
2. `TxtBox_UserName.png` - Username text box
3. `TxtBox_Password.png` - Password text box  
4. `btn_Login.png` - Login button
5. `lbl_HomePageLogo.png` - Home page logo
6. `lbl_LoggedUserName.png` - Logged user name label

## Setup Instructions

1. **Add SikuliX Dependency**: Uncomment the SikuliX dependency in `pom.xml`
2. **Capture Screenshots**: Use Sikuli IDE or screen capture tools to create the required images
3. **Place Images**: Save all image files in this directory
4. **Enable Code**: Uncomment the implementation code in `SikuliMainPage.java`
5. **Update Imports**: Uncomment the SikuliX imports in the class

## Image Guidelines

- Use PNG format for best compatibility
- Capture images at the resolution where tests will run
- Ensure images are clear and unique enough for reliable recognition
- Consider using similarity thresholds for better matching

## Alternative Approaches

If Sikuli setup is complex, consider these alternatives:
- Use Selenium WebDriver for web applications
- Use Java Robot class for simple desktop automation
- Use platform-specific automation tools (AutoIt for Windows, AppleScript for macOS)