package Pages.testcase;

import Base.BaseTest;
import Pages.BasePage.ChangPasswordpage;
import Pages.BasePage.DashboardPage;
import Pages.BasePage.LoginPgae;
import org.testng.annotations.Test;

public class EditCumerTest extends BaseTest {
    LoginPgae loginPgae;
    DashboardPage dashboardPage;
    ChangPasswordpage changPasswordpage;
    @Test
    public void  EditCumerTest(){
        //login
        loginPgae= new LoginPgae(driver);
        dashboardPage= loginPgae.login("mngr540912","jYhevYt");
        //changepasword
        changPasswordpage = dashboardPage.clickMenuChangPasswod();

    }
}
