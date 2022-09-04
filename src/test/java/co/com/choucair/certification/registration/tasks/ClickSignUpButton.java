package co.com.choucair.certification.registration.tasks;

import co.com.choucair.certification.registration.userinterface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickSignUpButton implements Task {
    public static Performable thePage() {
        return Tasks.instrumented(ClickSignUpButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestPage.SIGNUP_BUTTON));
    }
}
