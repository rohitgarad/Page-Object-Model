package test.cases;

import org.testng.annotations.Test;

import base.classes.BaseClass;
import page.classes.DashboardClass;
import page.classes.HomePageClass;
import page.classes.LoginPageClass;
import page.classes.LogoutClass;
import page.classes.ProfileClass;

public class LoginFunctionality extends BaseClass {

	
	@Test(priority = 1)
	public void Login() throws InterruptedException {
		
		HomePageClass h = new HomePageClass(driver);
		h.HomeLoginBtnClick();
		
		LoginPageClass l = new LoginPageClass(driver);
		l.EnterCred();
		Thread.sleep(5000);
		l.LogClick();
		
		DashboardClass d = new DashboardClass(driver);
		d.ProfileClick();
		
	}
	
	@Test(priority = 2)
	public void Profile() {
		
		ProfileClass p = new ProfileClass(driver);
		p.ProfileName();
	}
	
//	@Test(priority = 3)
//	public void LogoutClick() {
//		
//		LogoutClass x = new LogoutClass(driver);
//		x.LogoutBtnClick();
//	}
	
	
}
