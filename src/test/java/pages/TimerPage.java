package pages;

import org.openqa.selenium.By;

public class TimerPage {

    private final By btnTimer = By.xpath("//nh[@content-desc='Timer']");
    private final By btnNum1 = By.id("com.google.android.deskclock:id/timer_setup_digit_1");
    private final By btnNum2 = By.id("com.google.android.deskclock:id/timer_setup_digit_2");
    private final By btnNum3 = By.id("com.google.android.deskclock:id/timer_setup_digit_3");
    private final By btnNum4 = By.id("com.google.android.deskclock:id/timer_setup_digit_4");
    private final By btnNum5 = By.id("com.google.android.deskclock:id/timer_setup_digit_5");
    private final By btnNum6 = By.id("com.google.android.deskclock:id/timer_setup_digit_6");
    private final By btnNum7 = By.id("com.google.android.deskclock:id/timer_setup_digit_7");
    private final By btnNum8 = By.id("com.google.android.deskclock:id/timer_setup_digit_8");
    private final By btnNum9 = By.id("com.google.android.deskclock:id/timer_setup_digit_9");
    private final By btnNum0 = By.id("com.google.android.deskclock:id/timer_setup_digit_0");
    private final By timerCriado = By.id("com.google.android.deskclock:id/timer_time");

    public By getTimerCriado() {
        return timerCriado;
    }
    public By getBtnTimer(){
        return btnTimer;
    }
    public By getBtnNum1() {
        return btnNum1;
    }
    public By getBtnNum2() {
        return btnNum2;
    }

    public By getBtnNum4() {
        return btnNum4;
    }

    public By getBtnNum3() {
        return btnNum3;
    }
    public By getBtnNum5() {
        return btnNum5;
    }

    public By getBtnNum6() {
        return btnNum6;
    }

    public By getBtnNum7() {
        return btnNum7;
    }

    public By getBtnNum8() {
        return btnNum8;
    }

    public By getBtnNum9() {
        return btnNum9;
    }

    public By getBtnNum0() {
        return btnNum0;
    }

}
