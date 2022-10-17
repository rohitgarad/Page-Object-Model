package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Profile']")
	WebElement Profile;
	
	public DashboardClass(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void ProfileClick() {
		
		Profile.click();
	}
	
	
	
	

}
