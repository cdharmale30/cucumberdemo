package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "I:\\All eclipse Code7\\CucumberTestt\\src\\main\\java\\Features\\dealsmap.feature"
   ,glue = {"stepDefination"},
   format= {"pretty","html:test-outout", "json:json_output/cucumber.json"},
   dryRun=true ,
   monochrome=true
	//tags = {"~@SmokeTest" , "~@RegressionTest"}			

)

public class TestRunner {

}
