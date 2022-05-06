package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AlarmPage {

//    @FindBy(xpath = "//nh[@content-desc='Alarm']")
//    By alarmBtn;

//    @FindBy(id = "android:id/toggle_mode")
//    By tecladoBtn;

    private By alarmBtn = By.xpath("//nh[@content-desc='Alarm']");
    private By tecladoBtn = By.id("android:id/toggle_mode");
    private By inputMinute = By.id("android:id/input_minute");
    private By inputHour = By.id("android:id/input_hour");
    private By btnOk = By.id("android:id/button1");
    private By switchAlarmCriado = By.xpath("(//android.view.ViewGroup[@content-desc=\" Alarm\"])[3]/android.widget.Switch");
    private By msgDeErro = By.id("android:id/label_error");
    public By getAlarmBtn() {
        return alarmBtn;
    }
    public By getTecladoBtn() {
        return tecladoBtn;
    }
    public By getInputMinute() {
        return inputMinute;
    }
    public By getInputHour() {
        return inputHour;
    }
    public By getBtnOk() {
        return btnOk;
    }

    public By getSwitchAlarmCriado() {
        return switchAlarmCriado;
    }

    public By getMsgDeErro() {
        return msgDeErro;
    }

}
