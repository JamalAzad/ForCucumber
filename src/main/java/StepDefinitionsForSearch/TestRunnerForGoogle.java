package StepDefinitionsForSearch;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/GoogleSearch.feature",
        glue={"StepDefinitionsForSearch"},
        monochrome = true,
        plugin = {"html:target/Google/SearchHTMLReport.html",
                "json:target/Google/SearchJsonReport.json",
                "junit:target/Google/SearchJUnitReports/report.xml"}
)

public class TestRunnerForGoogle {

}
