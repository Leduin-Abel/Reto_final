package co.com.choucair.certification.registration.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/signup/devices")
public class uTestRegisterFormDevices extends PageObject {



    public static final Target MOBILE_BOX = Target.the("Input box for your mobile brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target MOBILE_MENU = Target.the("Dropdown menu for mobile brand")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-22-2\"]/span"));


    public static final Target MODEL_BOX = Target.the("Input box for your mobile model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target MODEL_MENU = Target.the("Dropdown menu for mobile model")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-23-0\"]/span"));

    public static final Target MOBILE_OS_BOX = Target.the("Input box for your mobile os")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target MOBILE_OS_DROP = Target.the("Dropdown menu for your mobile os")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-24-0\"]/span"));



    public static final Target NEXT_BUTTON = Target.the("Button for next page")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-24-2\"]/span/div"));



}
