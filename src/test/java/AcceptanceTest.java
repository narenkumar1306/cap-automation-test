import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by NarenNavya on 29/11/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",format = { "pretty", "html:target/cucumber",
        "json:target/cucumber.json"} , glue = "com/capautomation/test/steps")
public class AcceptanceTest {
}
