package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:target//cucumber-reports//cucumber-html-report.html"},
		dryRun = false,
		monochrome = true,
		tags = "@UAT2"
		//name = {"Logo"}
		)
public class TestRunner {

}