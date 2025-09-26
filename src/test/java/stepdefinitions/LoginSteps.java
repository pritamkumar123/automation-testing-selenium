package stepdefinitions;


import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginSteps extends BaseTest{
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }
}
