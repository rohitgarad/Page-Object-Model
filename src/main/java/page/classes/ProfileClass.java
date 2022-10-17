package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='Profile_displayName__CjeEc']")
	WebElement Name;
	
		
	public ProfileClass(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void ProfileName() {
		
		System.out.println(Name.getText());
	}
	
}
