package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//taggedFeature//",
		glue={"stepDefs"},
		monochrome=true,
//		tags="@SmokeTest"
//		tags="@RegressionTest"
//		tags="@SmokeTest or @RegressionTest"
		tags="@SmokeTest and @RegressionTest"
		
		)
public class CRUDRunner extends AbstractTestNGCucumberTests {
  
}
