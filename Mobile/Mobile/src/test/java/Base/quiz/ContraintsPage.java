package Base.quiz;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ContraintsPage extends BasePage {
    public ContraintsPage(AndroidDriver driver) {
        super(driver);
    }
    public By btnOk= By.id("android:id/button1");
    public void ItemPhone(String text){
        By ItemPhoneAppication= By.xpath(String.format("//*[@text='%s']",text));
        this._driver.findElement(ItemPhoneAppication).click();
    }
//    public void SelectbtnCallState(String text){
//        By BtnCallState= By.xpath(String.format("//*[@text='%s']",text));
//        this._driver.findElement(BtnCallState).click();
//    }
//    public void SelectOptionPhone(String itemOptionPhone){
//        String itemClearXpath=String.format("//*[@text='%s']",itemOptionPhone);
//        this._driver.findElement(By.xpath(itemClearXpath)).click();
//    }
    public void bttonOk(){
        this._driver.findElement(btnOk).click();
    }

}
