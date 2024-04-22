package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "rerun:target/failed_scenarios.txt",
                "html:target/cucumber_reports.html",
                "pretty"},
        features = "src/test/resources",
        glue = "stepDefinitions",
        tags="@StatusCodeCheck"
)

public class TestRunner {
}

