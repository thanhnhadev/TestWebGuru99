package Pages.BasePage;


import locator.LocatorPractive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By menuAddCustomer = By.xpath(LocatorPractive.menu_N_Customer);
    private By menuChangPassword = By.xpath(LocatorPractive.menu_changePassword);

    private By optionLogout = By.xpath(LocatorPractive.menu_Logout);

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public EditCustomerPage newCusstomer(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuAddCustomer));
        driver.findElement(menuChangPassword).click();

        return new EditCustomerPage(driver);
    }
    public ChangPasswordpage clickMenuChangPasswod(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuChangPassword));
        driver.findElement(menuChangPassword).click();

        return new ChangPasswordpage(driver);
    }


    public LoginPgae logOut(){
        driver.findElement(optionLogout).click();


        return new LoginPgae(driver);
    }
}
