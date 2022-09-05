package co.com.choucair.certification.registration.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/signup/devices")
public class uTestRegisterFormDevices extends PageObject {

    public static final Target PC = Target.the("Input box for computer OS")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));


    public static final Target PC_VERSION = Target.the("Input box for computer OS version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target PC_LANGUAGE = Target.the("Input box for computer language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));


    public static final Target MOBILE = Target.the("Input box for your mobile brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));


    public static final Target MODEL = Target.the("Input box for your mobile model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target MOBILE_OS = Target.the("Input box for your mobile os")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));


    public static final Target NEXT_BUTTON = Target.the("Button for next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));



}
