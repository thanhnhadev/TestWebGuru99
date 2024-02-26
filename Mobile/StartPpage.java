package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class StartPpage extends BasePage {
    By txtRes = By.id("io.appium.android.apis:id/text");

    public StartPpage(AndroidDriver driver) {
        super(driver);
    }

    public StartPpage navigateItem(String text) throws Exception {
        By btnItem = this._actionkeyword.findXPathByName(text);
        this._actionkeyword.click(btnItem);
        return new StartPpage(this._driver);
    }

    public boolean verify(String expectedText1, String expectedText2) throws Exception {
        String txtActual = this._actionkeyword.findElement(txtRes).getText();
        return txtActual.contains(expectedText1) && txtActual.contains(expectedText2);
    }

        public WebElement scrollToAnElementByText(AppiumDriver _driver, String text) {
            return _driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector())" +
                    ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));}

}
