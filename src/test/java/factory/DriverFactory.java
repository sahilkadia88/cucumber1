package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory 
{
	static WebDriver driver=null;
	
	public static void initilizeBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions option = new FirefoxOptions();
			driver = new FirefoxDriver(option);
		}
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}
