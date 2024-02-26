//package pages;
//
//import base.BasePage;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.PointerInput;
//import org.openqa.selenium.interactions.Sequence;
//
//import java.util.List;
//
//import static java.time.Duration.ofMillis;
//
//public class SupportV13DemosPage extends BasePage {
//    private By itemFragment = By.id("android:id/text1");
//    private By txtPage = By.id("com.touchboarder.android.api.demos:id/text");
//    private By btnLast = By.id("com.touchboarder.android.api.demos:id/goto_last");
//
//    public SupportV13DemosPage(AndroidDriver driver) {
//        super(driver);
//    }
//
//    public SupportV13DemosPage clickFragment() throws Exception {
//        this._actionkeyword.click(itemFragment);
//        return new SupportV13DemosPage(this._driver);
//    }
//
//    public SupportV13DemosPage clickPager(String name) throws Exception {
//        this._actionkeyword.click(this._actionkeyword.findXPathByName(name));//Pager
//        return new SupportV13DemosPage(this._driver);
//    }
//
//    public boolean verifyPage(String expectedText) {
//        String pageName = this._driver.findElement(txtPage).getText();
//        return pageName.contains(expectedText);
//    }
//
//    public SupportV13DemosPage scrollToPage(int numberScroll, String options) {
//
//        WebElement element = this._driver.findElement(By.xpath("//android.support.v4.view.ViewPager[@resource-id=\"com.touchboarder.android.api.demos:id/pager\"]/android.widget.LinearLayout/android.widget.FrameLayout"));
//
//        int centerY = element.getRect().y + (element.getSize().height / 2);
//
//        double startX = element.getRect().x + (element.getSize().width * 0.9);
//
//        double endX = element.getRect().x + (element.getSize().width * 0.1);
//
//        if (options.equals("right")) {
//            double tmp = startX;
//            startX = endX;
//            endX = tmp;
//        }
//
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//
//        Sequence sequence = new Sequence(finger, 1);
//
//        sequence.addAction(finger.createPointerMove(ofMillis(0),
//                PointerInput.Origin.viewport(), (int) startX, centerY));
//
//        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
//
//        sequence.addAction(finger.createPointerMove(ofMillis(600),
//                PointerInput.Origin.viewport(), (int) endX, centerY));
//
//        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
//
//        for (int i = 0; i < numberScroll; i++)
//            this._driver.perform(List.of(sequence));
//        return this;
//    }
//
//    public SupportV13DemosPage clickLastButton() throws Exception {
//        this._actionkeyword.click(btnLast);
//        return this;
//    }
//}
