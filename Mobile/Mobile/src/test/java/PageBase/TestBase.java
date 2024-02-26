package PageBase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public AndroidDriver _driver ;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        File app = new File("apk/Final_Exam_MacroDroid.apk");
        DesiredCapabilities capabilities =new DesiredCapabilities();
        capabilities.setCapability("app",app.getAbsolutePath());
        capabilities.setCapability("deviceName","PhoneTest");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12.0");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("autoGranPermission","true");
        capabilities.setCapability("appPackage","com.arlosoft.macrodroid");
        capabilities.setCapability("appWaitActivity","com.arlosoft.macrodroid.intro.IntroActivity");
        this._driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @AfterMethod
    public void tearDown(){
        _driver.quit();
    }
}
