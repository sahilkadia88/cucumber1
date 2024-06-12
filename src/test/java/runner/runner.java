package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features",
		glue= {"stepsdefinations","hooks"},
		plugin = { "pretty","html:target/report/cucumber.html"}
		//monochrome = true
		)

public class runner {

}
  