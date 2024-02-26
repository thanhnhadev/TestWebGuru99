package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature",
        glue = "StepsDefinition"
)

public class CucumberRunner  extends AbstractTestNGCucumberTests {
}
