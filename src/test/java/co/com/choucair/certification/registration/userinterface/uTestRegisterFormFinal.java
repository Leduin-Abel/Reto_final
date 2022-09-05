package co.com.choucair.certification.registration.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/signup/complete")
public class uTestRegisterFormFinal extends PageObject {

    public static final Target PASSWORD = Target.the("Input box for password")
            .located(By.xpath("//*[@id=\"password\"]"));


    public static final Target CONFIRMATION = Target.the("Input box for password confirmation")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));


    public static final Target UTEST_RULES = Target.the("Checkbox to confirm that you have read uTest rules")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY = Target.the("Checkbox to confirm that you have read uTest privacy and security policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


    public static final Target FINISH = Target.the("Button to finish the registration")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));




}
