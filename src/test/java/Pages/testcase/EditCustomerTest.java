package Pages.testcase;

import Base.BaseTest;
import Pages.BasePage.DashboardPage;
import Pages.BasePage.EditCustomerPage;
import Pages.BasePage.LoginPgae;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditCustomerTest extends BaseTest {
    LoginPgae loginPgae;
    DashboardPage dashboardPage;
    EditCustomerPage editCustomerPage;
    public EditCustomerTest(){
        //login
        loginPgae= new LoginPgae(driver);
        dashboardPage= loginPgae.login("mngr540912","jYhevYt");

        editCustomerPage = dashboardPage.newCusstomer();
    }

}
