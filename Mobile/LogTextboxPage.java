package pages;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LogTextboxPage extends StartPpage {
    By btnAdd= By.id("io.appium.android.apis:id/add");


    public LogTextboxPage(AndroidDriver driver) {
        super(driver);
    }
    public LogTextboxPage clickAdd() throws Exception {
        this._actionkeyword.click(btnAdd);
        return this;
    }
    public boolean verify(String expectedText) throws Exception {
        String txtActual = this._actionkeyword.findElement(txtRes).getText();
        System.out.println("txt"+txtActual);
        return txtActual.contains(expectedText);
    }



}
