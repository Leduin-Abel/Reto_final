package co.com.choucair.certification.registration.questions;

import co.com.choucair.certification.registration.userinterface.uTestRegisterFormPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question {

    private  String question;

    public Answer(String question){
        this.question = question;
        
    }

    public static Answer toThe (String question){
        return new Answer(question);

    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean result;

        boolean isVisible;

        if (uTestRegisterFormPersonal.WELCOME_TEXT.isVisibleFor(actor)){
            isVisible =true;
        } else {
            isVisible = false;
        }

        result = isVisible;

        return result;
    }
}
