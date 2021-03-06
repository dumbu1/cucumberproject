package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/resources/features/sprint1/feature1.feature",
		glue = "stepDefination",
		
		monochrome = true,
		dryRun = false,
		tags = "not @smoketest" 
		
				
		)

public class TestRun_Smoke extends AbstractTestNGCucumberTests {

}
