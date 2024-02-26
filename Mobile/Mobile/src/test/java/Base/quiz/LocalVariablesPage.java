package Base.quiz;

import Base.BasePage;
import Base.FillInfromationPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LocalVariablesPage extends FillInfromationPage {
    public LocalVariablesPage(AndroidDriver driver) {
        super(driver);
    }
    private By variableName= By.id("com.arlosoft.macrodroid:id/variable_new_variable_dialog_name");
    public  By CheckBooleanVariable=By.id("com.arlosoft.macrodroid:id/variable_new_variable_type_spinner");
    private By btnOk= By.id("com.arlosoft.macrodroid:id/okButton");
    public void fillInformation(){
        this._driver.findElement(variableName).sendKeys("testcase");
        this._driver.findElement(CheckBooleanVariable).click();
    }
    public void fillIfmattion(){
        this._driver.findElement(variableName).sendKeys("value 1");
        this._driver.findElement(CheckBooleanVariable).click();
    }
    public void VariableType(String Boolean){
        By slectCheckBoxRemove = By.xpath(String.format("//*[@text='%s']",Boolean));
        this._driver.findElement(slectCheckBoxRemove).click();
    }
    public void bttonOk(){
        this._driver.findElement(btnOk).click();
    }

}
