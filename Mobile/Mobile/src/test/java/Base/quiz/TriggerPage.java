package Base.quiz;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TriggerPage extends BasePage {
    public TriggerPage(AndroidDriver driver) {
        super(driver);
    }
    public By btnOk= By.id("android:id/button1");
    public void ItemApp(String text){
        By ItemAppication= By.xpath(String.format("//*[@text='%s']",text));
        this._driver.findElement(ItemAppication).click();
    }
    public void slectedItemAppInstall(String App){
        By slectecIteminstall= By.xpath(String.format("//*[@text='%s']",App));
        this._driver.findElement(slectecIteminstall).click();
    }
    public void RemoveApp(String Rmove){
        By slectCheckBoxRemove = By.xpath(String.format("//*[@text='%s']",Rmove));
        this._driver.findElement(slectCheckBoxRemove).click();
    }
    public void bttonOk(){
        this._driver.findElement(btnOk).click();
    }
    public void slectedItemAnyOption(String Any){
        By slectecCheckBoxAnyAplication= By.xpath(String.format("//*[@text='%s']",Any));
        this._driver.findElement(slectecCheckBoxAnyAplication).click();
    }
}
