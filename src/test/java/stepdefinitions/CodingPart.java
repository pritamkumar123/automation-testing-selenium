package stepdefinitions;

import org.junit.Test;
import pages.*;

public class CodingPart extends BaseTest {
    @Test
    public <WebDriver> void testLogin() throws InterruptedException {
        // Set the path to the ChromeDriver executable

        HomePage homePage = new HomePage(driver);
        homePage.open();

        //case-1
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();

        //case-2
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

       // case3
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.accounts();

        //case4
        TransferPage transferPage = new TransferPage(driver);
        transferPage.transfer();

        //case5
        BillPaymentPage billPaymentPage = new BillPaymentPage(driver);
        billPaymentPage.billpayment();
//
       //case6
        LoanPage loanPage = new LoanPage(driver);
        loanPage.loan();

        driver.quit();
    }
}