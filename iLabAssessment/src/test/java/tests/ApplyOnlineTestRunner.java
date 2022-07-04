package tests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/ApplyOnline.feature",
        glue = "stepDefinition",
        plugin = {"pretty","html:test-output"}
)
public class ApplyOnlineTestRunner {
}
