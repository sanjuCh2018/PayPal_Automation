package paypal.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.*;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {""},
        features = "src/main/resources/features"
                ,
        tags = "@automated",
        format =  {"pretty", "html:target/cukes", "json:target/cukes/report.json"})


@Test
public class TestRunnerMRS extends AbstractTestNGCucumberTests {

}
