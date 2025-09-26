package stepdefinitions;

import org.testng.annotations.Test;
import pages.BillPaymentPage;
import pages.LoginPage;

public class BillPaymentSteps extends BaseTest {
    @Test
    public void accountSteps() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        BillPaymentPage billPaymentPage = new BillPaymentPage(driver);
        billPaymentPage.billpayment();
    }
}