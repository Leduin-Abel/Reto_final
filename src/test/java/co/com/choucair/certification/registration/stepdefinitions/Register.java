package co.com.choucair.certification.registration.stepdefinitions;


import co.com.choucair.certification.registration.questions.Answer;
import co.com.choucair.certification.registration.tasks.OpenUp;
import co.com.choucair.certification.registration.userinterface.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.ui.Select;
import org.junit.Before;
import org.openqa.selenium.By;

public class Register {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^The user is on the Register form page$")
    public void theUserIsOnGoogle() {
        OnStage.theActorCalled("The user").wasAbleTo(OpenUp.thePage(), Click.on(uTestPage.SIGNUP_BUTTON));

    }
    @When("^The user completes the form")
        public void TheUserCompletesTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(uTestRegisterFormPersonal.FIRST_NAME),
                Enter.theValue("Jon").into(uTestRegisterFormPersonal.FIRST_NAME),
                Click.on(uTestRegisterFormPersonal.LAST_NAME),
                Enter.theValue("Doe").into(uTestRegisterFormPersonal.LAST_NAME),
                Click.on(uTestRegisterFormPersonal.EMAIL),
                Enter.theValue("jondoe@example.com").into(uTestRegisterFormPersonal.EMAIL),
                Click.on(uTestRegisterFormPersonal.BIRTH_MONTH),
                Click.on(uTestRegisterFormPersonal.BIRTH_DAY),
                Click.on(uTestRegisterFormPersonal.BIRTH_YEAR),
                Click.on(uTestRegisterFormPersonal.NEXT_BUTTON));

        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(uTestRegisterFormAddress.CITY),

                Click.on(uTestRegisterFormAddress.NEXT_BUTTON));


        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(uTestRegisterFormDevices.MOBILE_BOX),
                Click.on(uTestRegisterFormDevices.MOBILE_MENU),
                Click.on(uTestRegisterFormDevices.MODEL_BOX),
                Click.on(uTestRegisterFormDevices.MODEL_MENU),
                Click.on(uTestRegisterFormDevices.MOBILE_OS_BOX),
                Click.on(uTestRegisterFormDevices.MOBILE_OS_DROP),
                Click.on(uTestRegisterFormDevices.NEXT_BUTTON));


        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(uTestRegisterFormFinal.PASSWORD),
                Enter.theValue("SUPERsecurePAssw00rd").into(uTestRegisterFormFinal.PASSWORD),
                Click.on(uTestRegisterFormFinal.CONFIRMATION),
                Enter.theValue("SUPERsecurePAssw00rd").into(uTestRegisterFormFinal.CONFIRMATION),
                Click.on(uTestRegisterFormFinal.UTEST_RULES), Click.on(uTestRegisterFormFinal.PRIVACY),
                Click.on(uTestRegisterFormFinal.FINISH));


        }

        @Then("^The user sees (.*)$")
        public void TheUserWillSee(String question) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        }

}
