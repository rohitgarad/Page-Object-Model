package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutClass {

	
	@FindBy(xpath="//button[text()='Log out']")
	WebElement Logout;
	
	
	public LogoutClass(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void LogoutBtnClick() {
		
		Logout.click();
	}
}
