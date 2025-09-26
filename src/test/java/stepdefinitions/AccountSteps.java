package stepdefinitions;

import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;

    public class AccountSteps extends BaseTest {
        @Test
        public void accountSteps() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login();
            AccountsPage accountsPage = new AccountsPage(driver);
            accountsPage.accounts();
        }
    }