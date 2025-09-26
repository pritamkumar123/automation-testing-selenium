package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BillPaymentPage;
import pages.LoginPage;

public class NewBillPaymentSteps {

    WebDriver driver;
    LoginPage loginPage;
    BillPaymentPage billPaymentPage;

    @Before
    public void setUp() {
        // Always get the driver from BaseTest (don’t create it again here)
        driver = BaseTest.getDriver();
        loginPage = new LoginPage(driver);
        billPaymentPage = new BillPaymentPage(driver);
    }

    @Given("the user is logged in bill")
    public void the_user_is_logged_in_bill() {
        // Perform login only, don’t create new driver
        loginPage.login();
    }

    @When("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String pageName) {
        if (pageName.equalsIgnoreCase("Bill Pay")) {
            billPaymentPage.billPayLink.click();
        } else if (pageName.equalsIgnoreCase("Accounts Overview")) {
            billPaymentPage.accountsOverviewLink.click();
        }
    }

    @When("the user enters the payee name")
    public void the_user_enters_the_payee_name() {
        billPaymentPage.payeeName.sendKeys("Test");
    }

    @When("the user enters the payee street address")
    public void the_user_enters_the_payee_street_address() {
        billPaymentPage.payeeStreet.sendKeys("Test");
    }

    @When("the user enters the payee city")
    public void the_user_enters_the_payee_city() {
        billPaymentPage.payeeCity.sendKeys("Test");
    }

    @When("the user enters the payee state")
    public void the_user_enters_the_payee_state() {
        billPaymentPage.payeeState.sendKeys("Test");
    }

    @When("the user enters the payee zip code")
    public void the_user_enters_the_payee_zip_code() {
        billPaymentPage.payeeZipCode.sendKeys("Test");
    }

    @When("the user enters the payee phone number")
    public void the_user_enters_the_payee_phone_number() {
        billPaymentPage.payeePhone.sendKeys("Test");
    }

    @When("the user enters the payee account number")
    public void the_user_enters_the_payee_account_number() {
        billPaymentPage.payeeAccountNumber.sendKeys("13677");
    }

    @When("the user re-enters the account number")
    public void the_user_re_enters_the_account_number() {
        billPaymentPage.verifyAccount.sendKeys("13677");
    }

    @When("the user enters the payment amount")
    public void the_user_enters_the_payment_amount() {
        billPaymentPage.amount.sendKeys("100");
    }

    @When("the user selects the account with ID from the dropdown")
    public void the_user_selects_the_account_with_id_from_the_dropdown() {
        Select selectAccount = new Select(billPaymentPage.fromAccountDropdown);
        selectAccount.selectByValue("13899");
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Send Payment")) {
            billPaymentPage.sendPaymentButton.click();
        }
    }

    @Then("the user should see the payment success message")
    public void the_user_should_see_the_payment_success_message() {
        Assert.assertTrue(
                "Payment success message is not displayed",
                billPaymentPage.paymentSuccessTitle.isDisplayed()
        );
    }

    @Then("the user navigates back to the {string} page")
    public void the_user_navigates_back_to_the_page(String pageName) {
        if (pageName.equalsIgnoreCase("Accounts Overview")) {
            billPaymentPage.accountsOverviewLink.click();
        }
    }
}
