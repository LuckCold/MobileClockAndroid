package logics;

import config.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import pages.TimerPage;

public class TimerLogic {
    TimerPage timerPage;

    public TimerLogic(){
        timerPage = new TimerPage();
    }

    public void clicoNaOpcaoTimer(){
        DriverFactory.getDriver().findElement(timerPage.getBtnTimer()).click();
    }

    public void digitoUmTimer(){
        DriverFactory.getDriver().findElement(timerPage.getBtnNum3()).click();
        DriverFactory.getDriver().findElement(timerPage.getBtnNum1()).click();
        DriverFactory.getDriver().findElement(timerPage.getBtnNum0()).click();
        DriverFactory.getDriver().findElement(timerPage.getBtnNum0()).click();
    }
    public void inicioTimer(){
        TouchAction touchAction = new TouchAction(DriverFactory.getDriver());
        touchAction.tap(PointOption.point(538, 2070)).perform();
    }
    public void validoTimerCriado(){
        Assert.assertTrue(DriverFactory.getDriver().findElement(timerPage.getTimerCriado()).isEnabled());
    }
}
