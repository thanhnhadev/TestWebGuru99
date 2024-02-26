package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterPage extends StartPpage {
    By inputSearch = By.id("android:id/search_src_text");
    By listResult = By.xpath("//*[@resource-id='android:id/text1']");
    public FilterPage(AndroidDriver driver) {
        super(driver);
    }
    public FilterPage sendKey(String value) {
        this._actionkeyword.sendKey(inputSearch, value);
        return this;
    }
    public int countResult() throws Exception {
        List<WebElement> list = this._actionkeyword.findElements(listResult);
        return list.size();
    }
}
