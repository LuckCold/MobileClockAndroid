import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class main {
    public static void main(String[] args) throws MalformedURLException {


            AndroidDriver driver;

                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                desiredCapabilities.setCapability("platformName", "Android");
                desiredCapabilities.setCapability("appium:deviceName", "Pixel_5_API_31");
                desiredCapabilities.setCapability("appium:automationName", "Appium");
                desiredCapabilities.setCapability("appium:appPackage", "com.google.android.deskclock");
                desiredCapabilities.setCapability("appium:appActivity", "com.android.deskclock.DeskClock");
                desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
                desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
                desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
                desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

                URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

                driver = new AndroidDriver(remoteUrl, desiredCapabilities);



                MobileElement el1 = (MobileElement) driver.findElementByXPath("//nh[@content-desc=\"Alarm\"]/android.widget.TextView");
                el1.click();
                (new TouchAction(driver)).tap(PointOption.point(542, 2059)).perform();
                MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Switch to text input mode for the time input.");
                el2.click();
                MobileElement el3 = (MobileElement) driver.findElementById("android:id/input_hour");
                el3.sendKeys("03");
                MobileElement el4 = (MobileElement) driver.findElementById("android:id/input_minute");
                el4.sendKeys("30");
                MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
                el5.click();


                driver.quit();
            }
        }

