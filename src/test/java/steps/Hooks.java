package steps;

import config.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class Hooks {
    private static AndroidDriver driver;


    @BeforeClass
    public static void setUp() {
      DriverFactory.getDriver();
    }

    @AfterClass
    public static void tearDown(){
        DriverFactory.killDriver();
    }
}
