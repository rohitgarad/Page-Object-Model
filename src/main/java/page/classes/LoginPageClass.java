package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {

	WebDriver driver;
	
	@FindBy(id="modalusername")
	WebElement Email;
	
	@FindBy(id="current-password")
	WebElement Password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement Logbtn;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	WebElement ForgotPass;
	
	public LoginPageClass(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void EnterCred() {
		Email.sendKeys("rohitgarad07@gmail.com");
		Password.sendKeys("Rohit@1628");
	}
	
	public void LogClick() {
		Logbtn.click();
	}
	
	public void ForgotPassClick() {
		ForgotPass.click();
	}
}
