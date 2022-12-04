package StepDefinitionsForLogin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/login.feature",
glue={"StepDefinitionsForLogin"},
        plugin = {"html:target/HTMLReport.html",
        "json:target/JsonReport.json",
        "junit:target/JUnitReports/report.xml"},
tags="@STest"
)

public class TestRunner {

}
