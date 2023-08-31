
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;


public class DemoTest {

    WebDriver driver;
    String mHost="http://localhost:4723";

    @BeforeClass
    public void setUp() throws MalformedURLException {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName" , "UiAutomator2");
        caps.setCapability("platformName" , "Android");
        caps.setCapability("appium:platformVersion" , "9");
        caps.setCapability("appium:deviceName" , "Android Emulator");
        caps.setCapability("appium:app" ,
                System.getProperty("user.dir")+"/apps/app-debug.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723"), caps);


    }

    @Test
    public void test_Appium() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Between Test>>>>>>>>>>>>>>>>>>>>");
    }
    @AfterClass
    public void tearDown()    {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test End>>>>>>>>>>>>>>>>>>>>");
        driver.quit();
    }
}
