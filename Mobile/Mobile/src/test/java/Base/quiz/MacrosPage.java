package Base.quiz;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MacrosPage extends BasePage {
    public MacrosPage(AndroidDriver driver) {
        super(driver);
    }
    public void MacrosFooter(String text){
        By MacrosFooterItm= By.xpath(String.format("//*[@text='%s']",text));
        this._driver.findElement(MacrosFooterItm).click();
    }
    public By btnAddMacrosPage = By.id("com.arlosoft.macrodroid:id/macro_list_add_button");
    public By btnAddTrigger =  By.id("com.arlosoft.macrodroid:id/edit_macro_addTriggerButton");
    public By btnAddActions = By.id("com.arlosoft.macrodroid:id/edit_macro_addActionButton");
    public By btnContraints = By.id("com.arlosoft.macrodroid:id/edit_macro_addConstraintButton");
    public By btnLocalVariables = By.id("com.arlosoft.macrodroid:id/addVariableButton");
    public void AddMacrosPage(){
        this._driver.findElement(btnAddMacrosPage).click();
    }
    public void ImagebtnAddTrigger(){
        this._driver.findElement(btnAddTrigger).click();
    }
    public void ImagebtnAddAction(){
        this._driver.findElement(btnAddActions).click();
    }
    public void ImagebtnAddConstraintsPage(){
        this._driver.findElement(btnContraints).click();
    }
    public void ImagebtnLocalVariables(){
        this._driver.findElement(btnLocalVariables).click();
    }
}
