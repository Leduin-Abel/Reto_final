package co.com.choucair.certification.registration.stepdefinitions;

import co.com.choucair.certification.registration.questions.Answer;
import co.com.choucair.certification.registration.tasks.OpenUp;
import co.com.choucair.certification.registration.tasks.ClickSignUpButton;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormAddress;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormDevices;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormFinal;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormPersonal;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Search {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^The user is on uTest$")
    public void theUserIsOnGoogle() {
        OnStage.theActorCalled("The user").wasAbleTo(OpenUp.thePage());

    }

    @When("^The user searches clicks on the sign up button$")
    public void theUserSearchesUTestCom() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickSignUpButton.thePage());

    }

    @Then("^The user will see (.*)$")
    public void thePageWillLoad(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}



