package stepsdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.LoginPOM;

public class LoginUser 
{
	WebDriver driver = null;
	LoginPOM loginpage;
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() throws Exception 
	{
		 driver = DriverFactory.getDriver();
//		 Thread.sleep(2000);
//		 loginpage = new LoginPOM(driver);
//		 Thread.sleep(2000);
//		 loginpage.usernavigate();
		 
		 driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		 
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String email) throws Exception
	{
		Thread.sleep(2000);
		
		//loginpage.enteremail(email);
		 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) throws Exception 
	{
		Thread.sleep(2000);
		//loginpage.enterpassword(password);
		
		 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception
	{
		Thread.sleep(2000);
		//loginpage.clickonlogin();
		 driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();
		
	}
	@When("User click on logout button")
	public void user_click_on_logout_button() throws Exception
	{
		Thread.sleep(6000);
	    //loginpage.clickonlogout();
		 driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() 
	{
	    
	}

	@Then("User should get proper warning massage about credentials")
	public void user_should_get_proper_warning_massage_about_credentials()
	{
	    
	}


}
