package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM 
{
	
	WebDriver driver;
	public RegistrationPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myaccount;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registrationclick;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement enterfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement enterlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement enteremail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement entertelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement enterpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement enterrepassword;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]")
	private WebElement clicksubscribe;
	
	@FindBy(name="agree")
	private WebElement clickcheckbox;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement clicksubmitt;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement clickoncontinue;
	
	
	public void clickonmyaccount() 
	{
		myaccount.click();
		registrationclick.click();
		
	}
	public void enterfirstname(String firstname)
	{
		enterfirstname.sendKeys(firstname);
		
	}
	public void enterlastname(String lastname)
	{
		enterlastname.sendKeys(lastname);
		
	}
	public void enteremail(String email)
	{
		enteremail.sendKeys(email);
		
	}
	public void entertelephone(String telephone) 
	{
		entertelephone.sendKeys(telephone);
		
	}
	public void enterpassword(String password) 
	{
		enterpassword.sendKeys(password);
		
	}
	public void enterrepassword(String repassword) 
	{
		enterrepassword.sendKeys(repassword);
		
	}
	public void clickonsubscribe() 
	{
		clicksubscribe.click();
		
	}
	public void clickcheckbox()
	{
		clickcheckbox.click();
		
	}
	public void clickonsubmitt()
	{
		clicksubmitt.click();
		
	}
	public void clickoncontinue() 
	{
		clickoncontinue.click();
		
	}

}
