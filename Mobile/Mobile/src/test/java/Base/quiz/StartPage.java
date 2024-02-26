package Base.quiz;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class StartPage extends BasePage {
    public StartPage(AndroidDriver driver) {
        super(driver);
    }
    public By btnnext= By.xpath("com.arlosoft.macrodroid:id/button_next");
    public void startApp(){
        this._driver.findElement(btnnext).click();
    }

}
