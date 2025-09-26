package stepdefinitions;

import org.testng.annotations.Test;
import pages.LoanPage;
import pages.LoginPage;

public class LoanSteps extends BaseTest {
    @Test
    public void accountSteps() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        LoanPage loanPage = new LoanPage(driver);
        loanPage.loan();
    }
}