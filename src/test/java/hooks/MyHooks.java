package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks 
{
	WebDriver driver;
	@Before
	public void browserSetup()
	{
		DriverFactory.initilizeBrowser("chrome");
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	@After
	public void tearDown(Scenario scenario)
	{
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		if(scenario.isFailed())
		{
			byte[] srcScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenShot, "image/png", scenarioName);
		}
		driver.quit();

	}

}
