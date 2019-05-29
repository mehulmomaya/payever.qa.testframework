import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//import cucumber.api.testng;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features/", tags = "@regression",
        format = {"pretty", "html:buildcucumber", "json:build/reports/cucumber/cucumber-report.json"})
public class Runner  {
}
