package Pages.testcase;

import Base.BaseTest;
import Pages.BasePage.LoginPgae;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
   LoginPgae loginPgae;

   @Test
    public void testLoginSucess(){
       loginPgae= new LoginPgae(driver);
       loginPgae.login("mngr540912","jYhevYt");
      loginPgae.verifyLoginSuccsess();

   }


}
