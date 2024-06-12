package stepsdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.RegistrationPOM;

public class Registration 
{
	WebDriver driver = null;
	RegistrationPOM registration;
	
	@Given("User navigate to Register page")
	public void user_navigate_to_register_page() throws Exception
	{
	    driver = DriverFactory.getDriver();
	   // registration = new RegistrationPOM(driver);
	    //registration.clickonmyaccount();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}

	@When("User enters First Name  {string} into First Name field")
	public void user_enters_first_name_into_first_name_field(String firstname) throws Exception 
	{
		Thread.sleep(3000);
		//registration.enterfirstname(firstname);
		 driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
	    
	}

	@When("User enters Last Name  {string} into Last Name field")
	public void user_enters_last_name_into_last_name_field(String lastname) throws Exception 
	{
		Thread.sleep(3000);
		//registration.enterlastname(lastname);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}

	@When("User enters Email  {string} into Email field")
	public void user_enters_email_into_email_field(String email) throws Exception
	{
		Thread.sleep(3000);
		//registration.enteremail(email);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	}

	@When("User enters Telephone  {string} into Telephone field")
	public void user_enters_telephone_into_telephone_field(String telephone) throws Exception
	{
		Thread.sleep(3000);
		//registration.entertelephone(telephone);
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephone);
	}

	@When("User enters Password  {string} into Password field")
	public void user_enters_password_into_password_field(String password) throws Exception
	{
		Thread.sleep(3000);
		//registration.enterpassword(password);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	}

	@When("User enters Confirm Password {string} into Confirm Password field")
	public void user_enters_confirm_password_into_confirm_password_field(String repassword) throws Exception
	{
		Thread.sleep(3000);
		//registration.enterrepassword(repassword);
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(repassword);
	}

	@When("User click on Subscribe radio button")
	public void user_click_on_subscribe_radio_button() throws Exception 
	{
		Thread.sleep(3000);
		//registration.clickonsubscribe();
		  driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]")).click();
		
	    
	}
	@When("User click on Policy checkbox")
	public void user_click_on_policy_checkbox() 
	{
		//registration.clickcheckbox();
		  driver.findElement(By.name("agree")).click();
	}
	@When("User click on Submit button")
	public void user_click_on_submit_button() throws Exception 
	{
		Thread.sleep(3000);
		//registration.clickonsubmitt();
		  driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")).click();
		Thread.sleep(5000);
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button()
	{
	    //registration.clickoncontinue();
		  driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}


	@Then("User should get successfully Register")
	public void user_should_get_successfully_register() 
	{
	    
	}
	@Then("User should not Register with same email")
	public void user_should_not_register_with_same_email()
	{
	    
	}
	



}
