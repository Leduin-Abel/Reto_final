package co.com.choucair.certification.registration.stepdefinitions;

import co.com.choucair.certification.registration.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchAndRegister {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user is on google$")
    public void theUserIsOnGoogle() {
        OnStage.theActorCalled("The user").wasAbleTo(OpenUp.thePage());

    }

    @When("^The user searches uTest\\.com$")
    public void theUserSearchesUTestCom() {

    }

    @Then("^The page will load$")
    public void thePageWillLoad() {

    }
}
