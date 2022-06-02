package logics;

import config.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import pages.AlarmPage;
import utils.Utility;

public class AlarmLogic {
    private AlarmPage alarmPage;
    private static TouchAction touchAction;
    public AlarmLogic(){
        touchAction = new TouchAction(DriverFactory.getDriver());
        alarmPage = new AlarmPage();


    }

    public void acessoOpcaoAlarme(){
        DriverFactory.getDriver().findElement(alarmPage.getAlarmBtn()).click();
    }
    public void clicoEmAddAlarme(){
//        System.out.println(DriverFactory.getDriver().manage().window().getSize().height);
//        //2070
//        System.out.println(DriverFactory.getDriver().manage().window().getSize().width);
//        //534
        touchAction.tap(Utility.getElementByPercent(93, 15)).perform();
    }
    public void alteroParaTeclado(){
        DriverFactory.getDriver().findElement(alarmPage.getTecladoBtn()).click();
    }
    public void digitohora(String hora){
        DriverFactory.getDriver().findElement(alarmPage.getInputHour()).sendKeys(hora);
    }
    public void digitoMin(String min){
        DriverFactory.getDriver().findElement(alarmPage.getInputMinute()).sendKeys(min);
    }
    public void clicoBtnOk(){
        DriverFactory.getDriver().findElement(alarmPage.getBtnOk()).click();
    }
    public void validoAlarmCriado(){
        Assert.assertEquals("ON", DriverFactory.getDriver().
                findElement(alarmPage.getSwitchAlarmCriado()).getText());
    }

    public void validoMsgDeErro(){
        Assert.assertEquals("Enter a valid time",
                DriverFactory.getDriver().findElement(alarmPage.getMsgDeErro()).getText());
    }
    public void crioAlarmeInvalido(){
        clicoEmAddAlarme();
        alteroParaTeclado();
        digitohora("13");
        digitoMin("30");
        clicoBtnOk();
    }

    public void crioAlarmeValido(){
        clicoEmAddAlarme();
        alteroParaTeclado();
        digitohora("11");
        digitoMin("30");
        clicoBtnOk();

    }
}
