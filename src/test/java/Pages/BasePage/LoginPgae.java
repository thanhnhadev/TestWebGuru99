package Pages.BasePage;

import Constants.ConfigData;
import locator.LocatorPractive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPgae {
    private WebDriver driver;
    private WebDriverWait wait;

    private By inputUserID = By.xpath(LocatorPractive.inputUserName);
    private By inputPasssword = By.xpath(LocatorPractive.inputPassword);
    private  By btnLogin = By.xpath(LocatorPractive.buttonLogin);
//    private By errorMessage = By.xpath(LocatorCRM.error_mess);
    public LoginPgae(WebDriver _driver){
        this.driver=_driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    private void setinputUserID(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputUserID));
        driver.findElement(inputUserID).sendKeys(email);
    }
    private void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPasssword));
        driver.findElement(inputPasssword).sendKeys(password);
    }
    private void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin));
        driver.findElement(btnLogin).click();
    }
    public void verifyLoginSuccsess(){
        Assert.assertFalse(driver.getCurrentUrl().contains("authentication"),"fail van login");
    }
    public DashboardPage login(String email, String password){
        driver.get(ConfigData.URL);
        setinputUserID(email);
        setPassword(password);
        clickLoginButton();

        return new DashboardPage(driver);

    }
}
