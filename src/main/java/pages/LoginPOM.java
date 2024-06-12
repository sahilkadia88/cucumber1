package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM 
{
	WebDriver driver;
	public LoginPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myaccountclick;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginclick;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement enteremail;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement enterpassword;
	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement clickonlogin;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	private WebElement clickonlogout;
	
	
	
	
	
	
	public void usernavigate() throws Exception 
	{
		
		myaccountclick.click();
		loginclick.click();
		
	}
	
	public void enteremail(String email) throws Exception 
	{
		enteremail.sendKeys(email);
	}

	public void enterpassword(String password) {
		// TODO Auto-generated method stub
		enterpassword.sendKeys(password);
	}

	public void clickonlogin() {
		// TODO Auto-generated method stub
		clickonlogin.click();
		
	}

	public void clickonlogout()
	{
		clickonlogout.click();
		
	}
	
	

}
