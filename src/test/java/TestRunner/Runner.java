package TestRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


//This is the Runner configuration

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepDefinitions"
//        plugin = {"pretty"}, monochrome = true
)
public class Runner {
}

