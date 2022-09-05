package co.com.choucair.certification.registration.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/signup/address")
public class uTestRegisterFormAddress extends PageObject {

    public static final Target CITY = Target.the("Input box for city name")
            .located(By.xpath("//*[@id=\"city\"]"));




    public static final Target NEXT_BUTTON = Target.the("Button for next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
