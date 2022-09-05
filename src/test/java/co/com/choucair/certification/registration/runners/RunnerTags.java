package co.com.choucair.certification.registration.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)


@CucumberOptions(features = {"src/test/resources/features/1_search.feature","src/test/resources/features/2_register.feature"},
        tags = "@stories",
        glue = "co.com.choucair.certification.registration.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class RunnerTags {

}
