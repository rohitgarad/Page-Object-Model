package test.cases;

import org.testng.annotations.Test;

import base.classes.BaseClass;
import page.classes.LogoutClass;

public class LogoutFunctionality extends BaseClass{
	
	@Test
	public void LogoutFunction() {
		
		LogoutClass L = new LogoutClass(driver);
		L.LogoutBtnClick();
	}
}
