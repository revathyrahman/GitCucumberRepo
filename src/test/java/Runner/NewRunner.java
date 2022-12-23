package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/FeatureFiles/Background.feature",
glue = "StepDefinitions",
//tags= "@Smoke",
 plugin = { "pretty", "html:target/cucumber.html" }, monochrome = true )
public class NewRunner {


}
