package cucumberRun;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@SignIn-Simple",
        glue = {"stepdefs.MyStepdef"},
        features = "/Users/admin/Documents/automation/untitled/src/main/resources/feature/tc1.feature"
)
public class Run {
}
