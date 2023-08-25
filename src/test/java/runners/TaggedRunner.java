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
//		tags="@SmokeTest and @RegressionTest"
//		tags="@PhaseTwo"
//		tags="@PhaseOne"
		tags="@PhaseOne and @SmokeTest"
		)
public class TaggedRunner extends AbstractTestNGCucumberTests {
  
}
