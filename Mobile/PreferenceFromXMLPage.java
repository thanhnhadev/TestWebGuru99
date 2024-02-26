package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PreferenceFromXMLPage extends StartPpage {
    By txtCheckbox = By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
    By checkbox = By.xpath("(//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"])[1]");

    public PreferenceFromXMLPage(AndroidDriver driver) {
        super(driver);
    }

    public boolean isCheck() throws Exception {
        this._actionkeyword.click(txtCheckbox);
        WebElement e = this._actionkeyword.findElement(checkbox);
        if (e.getAttribute("checked").equals("true")) return true;

        return false;
    }

}
