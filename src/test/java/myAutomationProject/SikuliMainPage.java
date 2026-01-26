package myAutomationProject;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliMainPage {
	
	Screen screen = new Screen();
	
	Pattern clickITM = new Pattern("D:\\HisanBackup\\HisanS\\D\\Hisan\\Learning\\Roshana\\SikuliImages\\ITMAPP.PNG");
	Pattern TypeUserName = new Pattern ("D:\\HisanBackup\\HisanS\\D\\Hisan\\Learning\\Roshana\\SikuliImages\\TxtBox_UserName.PNG");
	Pattern TypePassword = new Pattern ("D:\\HisanBackup\\HisanS\\D\\Hisan\\Learning\\Roshana\\SikuliImages\\TxtBox_Password.PNG");
	Pattern ClickLoginButton = new Pattern ("D:\\HisanBackup\\HisanS\\D\\Hisan\\Learning\\Roshana\\SikuliImages\\btn_Login.PNG");
	Pattern HomePageLogo = new Pattern ("D:\\HisanBackup\\HisanS\\D\\Hisan\\Learning\\Roshana\\SikuliImages\\lbl_HomePageLogo.PNG");
	Pattern LoggedUserName = new Pattern ("D:\\HisanBackup\\HisanS\\D\\Hisan\\Learning\\Roshana\\SikuliImages\\lbl_LoggedUserName.PNG");


	public void LogintoDesktopITMAPP(String UserName, String Password) throws FindFailed
	{	
		screen.setAutoWaitTimeout(10);
		
		screen.wait(clickITM, 10);
		screen.doubleClick(clickITM);
		screen.wait(TypeUserName, 10);
		screen.type(TypeUserName, UserName);
		screen.type(TypePassword, Password);
		screen.click(ClickLoginButton);
		
		screen.wait(HomePageLogo, 15);
		}
	public boolean ensureExists() {

		 if (screen.exists(LoggedUserName) != null) {
		  return true;
		 }
		 return false;
		}

}
