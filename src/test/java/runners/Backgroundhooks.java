package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features="src//test//resources//taggedFeature//ContactCRUD2.feature",
			glue={"stepDefs"},
			monochrome=true,
			tags = "@PhaseTwo"
			)
	public class Backgroundhooks extends AbstractTestNGCucumberTests {
	  
	
}
