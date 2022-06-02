package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        plugin = {
                "utils.TestDetails",
                "pretty",
                "html:target/reports/Relatorio.html"
        },
        snippets = SnippetType.CAMELCASE,
        tags = "@alarm_valido",
        dryRun = false
)
public class mainRunner {
}
