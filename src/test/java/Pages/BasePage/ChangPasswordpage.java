package Pages.BasePage;

import locator.LocatorPractive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ChangPasswordpage {
    private WebDriver driver;

    private WebDriverWait wait;
    private By pwd_old = By.xpath(LocatorPractive.pwd_old);
    private By pwd_new = By.xpath(LocatorPractive.pwd_new);
    private By pwd_Config= By.xpath(LocatorPractive.pwd_cofig);

    private By btnSubmit= By.xpath(LocatorPractive.btnSubmit);
    private By btnResert = By.xpath(LocatorPractive.btnReset1);
    public ChangPasswordpage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    private void Passwod_Old(String pwd){
        driver.findElement(pwd_old).sendKeys(LocatorPractive.pwd_old1);
    }
    private void setPassword(String pwd){

        driver.findElement(pwd_new).sendKeys(LocatorPractive.pwd_new1);
    }
    private void setConfigPassword(String pwd){

        driver.findElement(pwd_Config).sendKeys(LocatorPractive.pwd_cofig1);
    }
    public Boolean checkElementExist(String pwd_new,String  pwd_Config)
    {
        List<WebElement> listElement1 = driver.findElements(By.xpath(pwd_new));
        List<WebElement> listElement2 = driver.findElements(By.xpath(pwd_Config));

        if (listElement1==listElement2) {
            driver.findElement(btnSubmit).click();
        } else {

            driver.findElement(btnResert).click();
        }
        return null;
    }

}
