package PageObejects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Merc_LoginPage {
	WebDriver driver;
	
 public Merc_LoginPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath="//input[@name='userName']")
 WebElement txt_username;
 @FindBy(xpath="//input[@name='password']")
 WebElement txt_password;
 @FindBy(xpath="//input[@name='submit']")
 WebElement btn_login;
 
 
	public void enterUsername(String uname)
	{
		txt_username.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	public void clickOnLoginbutton()
	{
		btn_login.click();
	}
	
	public void enterUsernameAndPassword(String uname,String pwd)
	{
		txt_username.sendKeys(uname);
		txt_password.sendKeys(pwd);
		
	}
	
	
}
