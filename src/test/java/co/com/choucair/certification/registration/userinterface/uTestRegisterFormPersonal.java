package co.com.choucair.certification.registration.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



@DefaultUrl("https://www.utest.com/signup/personal")
public class uTestRegisterFormPersonal extends PageObject {

    public static final Target WELCOME_TEXT = Target.the("Text that appears on the first step to register")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));


    public static final Target FIRST_NAME = Target.the("First name input box")
            .located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target LAST_NAME = Target.the("Last name input box")
            .located(By.xpath("//*[@id=\"lastName\"]"));

    public static final Target EMAIL = Target.the("E-mail input box")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target BIRTH_MONTH = Target.the("Birth month input box")
            .located(By.xpath("//*[@id=\"birthMonth\"]/option[2]"));

    public static final Target BIRTH_DAY = Target.the("Birth day input box")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[15]"));

    public static final Target BIRTH_YEAR = Target.the("Birth  year input box")
            .located(By.xpath("//*[@id=\"birthYear\"]/option[10]"));

    public static final Target NEXT_BUTTON = Target.the("Button for next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}
