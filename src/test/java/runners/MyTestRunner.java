package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//UserLoginFeature.feature",
		glue={"stepDefs"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/reports/htmlReports.html",
//				"usage:target/reports/UsageReports",
//				"json:target/reports/jsonReports.json",
//				"junit:target/reports/JunitReports.junit"
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				"rerun:target/failedScenario.txt"
		}
		)
public class MyTestRunner extends AbstractTestNGCucumberTests {
  
}
