
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"classpath:features"},
        glue = {"step_definitions"},
        monochrome = true,
        snippets = cucumber.api.SnippetType.CAMELCASE,
        plugin = { "pretty", 
        		   "html:target/cucumber", 
        		   "json:target/cucumber-report.json",
        		   "junit:target_json/Cucumber_junit.xml"

        		}

)
public class CukesRunnerTest {
}