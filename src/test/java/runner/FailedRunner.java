package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/failed_scenarios.txt",
                "json:target/rerun_failed_scenarios.json",
                "pretty"},
        features = "@target/failed_scenarios.txt",
        glue = "stepDefinitions"
)

public class FailedRunner {
}
