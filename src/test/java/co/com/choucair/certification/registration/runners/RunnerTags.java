package co.com.choucair.certification.registration.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)


@CucumberOptions(features = {"src/test/resources/features/search.feature","src/test/resources/features/register.feature"},
        tags = "@story1,@story2",
        glue = "co.com.choucair.certification.registration.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class RunnerTags {

}
