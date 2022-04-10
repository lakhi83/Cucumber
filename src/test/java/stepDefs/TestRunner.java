package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		
	features=	"src/test/java/features",
	//tags = {"@Sanity"},
	//tags = {"@Sanity,@Regression"},
			//tags = {"@Sanity or @Regression"},
	
	//tags = {"@Regression and @Rapid"},  //run multiple tags using and condition
	//tags = {"@Regression,@Rapid"},
	
		tags= {"@F_1234"},
		
		
	glue ={"stepDefs"}
		
		
		
		)





public class TestRunner {

}
