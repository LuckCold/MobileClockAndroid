package utils;

import config.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import java.awt.*;

public class Utility {
    public static PointOption getElementByPercent(float xPercent, float yPercent){
        int screenSizeWidth = DriverFactory.getDriver().manage().window().getSize().width;
        int screenSizeHeight = DriverFactory.getDriver().manage().window().getSize().height;
        float WIDTH = screenSizeWidth * (xPercent/100);
        float HEIGHT = screenSizeHeight * (yPercent/100);
        return PointOption.point((int)WIDTH, (int)HEIGHT);
    }

}
