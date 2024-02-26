package Base.quiz;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {
    public MainPage(AndroidDriver driver) {
        super(driver);
    }
    private By Allown= By.id("com.koushikdutta.superuser:id/allow");
    public void AllownPage(){


        this._driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this._driver.findElement(Allown).click();
    }
}
