package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {

	WebDriver driver;
	
	@FindBy(id="w3loginbtn")
    private WebElement HomeLoginBtn ;
	
	
	public HomePageClass(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void HomeLoginBtnClick() {
		
		HomeLoginBtn.click();
	}
	
	public void HomeTitle() {
		
		driver.getTitle();
	}
	
}
