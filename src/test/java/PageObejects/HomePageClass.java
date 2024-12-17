package PageObejects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
WebDriver driver;

	public HomePageClass(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Login Successfully']")
	WebElement lbl_LoginSuccessful;
	
	public boolean LoginSuccess_IsDisplayed()
	{
		return lbl_LoginSuccessful.isDisplayed();
	}
	
}
