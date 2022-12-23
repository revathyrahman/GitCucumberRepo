package Runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

  
	@CucumberOptions(tags = "", features = {"src/test/java/FeatureFiles/Parallel"}, 
								glue = "StepDefinitions",
								plugin = {"html:target/cucumber.html"})

public class TestNGRunner extends AbstractTestNGCucumberTests {
			@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	    
	
	} 