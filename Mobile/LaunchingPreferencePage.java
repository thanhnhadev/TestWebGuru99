package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchingPreferencePage extends StartPpage {
By btnMyPreference= By.xpath("//android.widget.ListView[@resource-id='android:id/list']/android.widget.LinearLayout[1]");
    public LaunchingPreferencePage(AndroidDriver driver) {
        super(driver);
    }

    public LaunchingPreferencePage click(String name) throws Exception {
        this._actionkeyword.click(this._actionkeyword.findXPathByName(name));
        return this;

    }
    public LaunchingPreferencePage clickMyPreference(int number) throws Exception {
        for (int i = 0; i < number; i++) {
            // Chờ cho nút hiển thị và có thể click được
            WebElement button = this._actionkeyword.click(btnMyPreference);
        }
        return this;
    }

    public boolean verify(int numberExpected,String textElement) throws Exception {
        By element=this._actionkeyword.findXPathByName(textElement);
        String txtActual = this._actionkeyword.findElement(element).getText();
        System.out.println("Actual"+txtActual);
        return txtActual.contains(numberExpected+"");
    }
    public LaunchingPreferencePage back(){
        this._actionkeyword.back();
        return this;
    }
}
