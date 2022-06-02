package steps;

import config.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
    private static AndroidDriver driver;
    static Scenario scenario;


    @Before
    public static void setUp() {
      DriverFactory.getDriver();
    }

    @After
    public static void tearDown(){
        DriverFactory.killDriver();
    }
}
