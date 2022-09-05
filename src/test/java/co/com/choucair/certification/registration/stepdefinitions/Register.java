package co.com.choucair.certification.registration.stepdefinitions;


import co.com.choucair.certification.registration.questions.Answer;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormAddress;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormDevices;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormFinal;
import co.com.choucair.certification.registration.userinterface.uTestRegisterFormPersonal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class Register {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
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
                Enter.theValue("Medellin").into(uTestRegisterFormAddress.CITY),
                Click.on(uTestRegisterFormAddress.POSTAL_CODE),
                Enter.theValue("050031").into(uTestRegisterFormAddress.POSTAL_CODE),
                Click.on(uTestRegisterFormAddress.COUNTRY),
                Enter.theValue("Colombia").into(uTestRegisterFormAddress.COUNTRY),
                Click.on(uTestRegisterFormAddress.NEXT_BUTTON));


        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(uTestRegisterFormDevices.PC),
                Enter.theValue("Windows").into(uTestRegisterFormDevices.PC),
                Click.on(uTestRegisterFormDevices.PC_VERSION),
                Enter.theValue("10").into(uTestRegisterFormDevices.PC_VERSION),
                Click.on(uTestRegisterFormDevices.MOBILE),
                Enter.theValue("Motorola").into(uTestRegisterFormDevices.MOBILE),
                Click.on(uTestRegisterFormDevices.MODEL),
                Enter.theValue("Moto G30").into(uTestRegisterFormDevices.MODEL),
                Click.on(uTestRegisterFormDevices.MOBILE_OS),
                Enter.theValue("Android 12").into(uTestRegisterFormDevices.MOBILE_OS),
                Click.on(uTestRegisterFormDevices.NEXT_BUTTON));


        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(uTestRegisterFormFinal.PASSWORD),
                Enter.theValue("SUPERsecurePAssw00rd").into(uTestRegisterFormFinal.PASSWORD),
                Click.on(uTestRegisterFormFinal.CONFIRMATION),
                Enter.theValue("SUPERsecurePAssw00rd").into(uTestRegisterFormFinal.CONFIRMATION),
                Click.on(uTestRegisterFormFinal.UTEST_RULES), Click.on(uTestRegisterFormFinal.PRIVACY),
                Click.on(uTestRegisterFormFinal.FINISH));


        }

        @Then("^The user will see (.*)$")
        public void TheUserWillSee(String question) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        }

}
