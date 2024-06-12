package stepsdefinations;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.SearchPOM;

public class Search 
{
	WebDriver driver = null;
	SearchPOM search;
	@Given("User open the application")
	public void user_open_the_application()
	{
		driver = DriverFactory.getDriver();
		search = new SearchPOM(driver);
		
	    
	}

	@When("User enter valid product {string} into search box field")
	public void user_enter_valid_product_into_search_box_field(String productname) throws Exception 
	{
		search.enterproduct(productname);
		Thread.sleep(3000);
	}

	@When("User click on search button")
	public void user_click_on_search_button() throws Exception 
	{
		Thread.sleep(3000);
		search.clickonsearchbnt();
	    
	}
	@When("User get the search result")
	public void user_get_the_search_result() throws Exception 
	{
		Thread.sleep(3000);
		search.getsearchresult();
	}

	@Then("User should get valid product in search result")
	public void user_should_get_valid_product_in_search_result() 
	{
	    
	}

	@When("User enter valid product into search box field")
	public void user_enter_valid_product_into_search_box_field() {
	    
	}


}
