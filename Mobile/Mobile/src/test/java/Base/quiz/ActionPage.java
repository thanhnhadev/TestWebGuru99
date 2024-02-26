package Base.quiz;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ActionPage extends BasePage {
    public ActionPage(AndroidDriver driver) {
        super(driver);
    }
    public void selectItemLogin(String itemText){
        String itemXpath =String.format("//*[@text='%s']",itemText);
        this._driver.findElement(By.xpath(itemXpath)).click();
    }

//    public void btnclearLog(String itemClear){
//        String itemClearXpath=String.format("//*[@text='%s']",itemClear);
//        this._driver.findElement(By.xpath(itemClearXpath)).click();
//    }
//
//    public void SelectOption(String itemOption){
//        String itemClearXpath=String.format("//*[@text='%s']",itemOption);
//        this._driver.findElement(By.xpath(itemClearXpath)).click();
//    }
    public By btnOk= By.id("android:id/button1");
    public void bttonOk(){
        this._driver.findElement(btnOk).click();
    }
}
