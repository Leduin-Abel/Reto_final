package co.com.choucair.certification.registration.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



@DefaultUrl("https://www.utest.com/signup/personal")
public class uTestRegisterFormPersonal extends PageObject {

    public static final Target WELCOME_TEXT = Target.the("Text that appears on the first step to register")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));


    
}
