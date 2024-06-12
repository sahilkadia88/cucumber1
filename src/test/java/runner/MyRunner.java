package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			//features = "src\\test\\resources\\Features\\LoginUser.feature",
			features ="src\\test\\resources\\Features\\LoginUser.feature",
			glue = {"stepsdefinations","hooks"},
			plugin = {"pretty","html:target/report/cucumber.html","json:target/report/cucumber.json"}
			)
public class MyRunner
{
	

}

//HTML Reports

//plugin = { "pretty", "html:target/CucumberReports/HtmlReports.html" },

//Json Reports

//plugin = { "pretty", "json:target/CucumberReports/Cucumber.json" }

//XML reports

// plugin = { "pretty", "junit:target/CucumberReports/Cucumber.xml" },

// plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",

// "junit:target/cucumber-reports/Cucumber.xml",

// "html:target/cucumber-reports/reports.html"

// },

//


