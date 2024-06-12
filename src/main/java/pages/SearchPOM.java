package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOM 
{
	WebDriver driver;
	public SearchPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement enterproduct;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	private WebElement clickonsearchbnt;
	
	@FindBy(xpath="//body/div[@id='product-search']/div[1]/div[1]/div[3]")
	private WebElement searchresult;
	
	public void enterproduct(String productname) 
	{
		enterproduct.sendKeys(productname);
		
	}

	public void clickonsearchbnt()
	{
		
		clickonsearchbnt.click();
		
	}

	public void getsearchresult() 
	{
		//String result = searchresult.getText();
		boolean result = searchresult.isDisplayed();
		System.out.println(result);
	}
}
