package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html"},
		features = "src/test/java/FeatureFiles/Omayo.feature",
		glue = "StepDefinitions",
		monochrome=true,
		tags = "@Valid or @Smoke"
		)

public class Runner {

}
