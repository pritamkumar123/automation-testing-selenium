package stepdefinitions;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TransferPage;

public class TransferSteps extends BaseTest {
    @Test
    public void transferSteps() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        TransferPage transferPage = new TransferPage(driver);
        transferPage.transfer();
    }
}