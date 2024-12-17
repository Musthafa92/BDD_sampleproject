package StepDefination;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObejects.HomePageClass;
import PageObejects.Merc_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef 
{
    static WebDriver driver;
  Merc_LoginPage login;
  HomePageClass home;
	@Given("User is in Login Page")
	public void user_is_in_login_page() 
	{
	   driver=new ChromeDriver();
	   driver.get("https://www.demo.guru99.com/test/newtours/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	   login=new Merc_LoginPage(driver);
		
	}
	@When("User entered valid Username and Password")
	public void user_entered_valid_username_and_password() 
    {
	   
	   login.enterUsername("mercury");
	   login.enterPassword("mercury");
	   
		
    }
	
	@When("User entered {string} and {string}")
	public void user_entered_and(String username, String password) 
	{
     login.enterUsernameAndPassword(username, password);
	}

	@And("Click on Login button")
	public void click_on_login_button() 
	{
		login.clickOnLoginbutton();
	}

	@Then("User shoulb be navigated to Home page")
	public void user_shoulb_be_navigated_to_home_page() 
	{
		home=new HomePageClass(driver);
	   Assert.assertEquals(home.LoginSuccess_IsDisplayed(), true);
	}

	@And("Close the browser")
	public void close_the_browser()
	{
		driver.quit();
	}

	
/*
	@When("User entered valid Username and Password")
	public void user_entered_valid_username_and_password() 
    {
	   
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");  
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	}
	
// Parameterization Example
	@When("User entered {string} and {string}")
	public void user_entered_and(String username, String password) 
	{

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);  
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);  
		
	}

	@And("Click on Login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("User shoulb be navigated to Home page")
	public void user_shoulb_be_navigated_to_home_page() 
	{
	   Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Login Successfully']")).isDisplayed(), true);
	}

	@And("Close the browser")
	public void close_the_browser()
	{
		driver.close();
	}
*/
}
