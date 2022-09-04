package co.com.choucair.certification.registration.questions;

import co.com.choucair.certification.registration.userinterface.uTestRegisterForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question {

    private  String question;

    public Answer(String question){
        this.question = question;
        
    }

    public static Answer toThe (String question){

    }

    @Override
    public Object answeredBy(Actor actor) {
        String text = Text.of(uTestRegisterForm.WELCOME_TEXT).viewed
        boolean result;
                if(question.equals(text)){
                    result = true;
                } else {
                    result = false;
                }
        return result;
    }
}
