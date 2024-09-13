package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//Features/LoginOrangeHRM.feature",
		glue = "StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		)
public class Run extends AbstractTestNGCucumberTests {

}
