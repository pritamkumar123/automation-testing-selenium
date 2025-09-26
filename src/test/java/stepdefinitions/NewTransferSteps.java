package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.TransferPage;
import org.openqa.selenium.support.ui.Select;

public class NewTransferSteps {

    WebDriver driver;
    LoginPage loginPage;
    TransferPage transferPage;

    @Given("the user is logged in transfer")
    public void the_user_is_logged_in_transfer() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\Chrome_Driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // ✅ Initialize page objects AFTER driver is created
        loginPage = new LoginPage(driver);
        transferPage = new TransferPage(driver);
    }

    @When("the user clicks on the {string} link here")
    public void the_user_clicks_on_the_link_here(String linkText) {
        if (linkText.equalsIgnoreCase("Transfer Funds")) {
            transferPage.transferFundsLink.click();
        } else if (linkText.equalsIgnoreCase("Accounts Overview")) {
            transferPage.accountsOverviewLink.click();
        }
    }

    @When("the user enters data in the Amount field")
    public void the_user_enters_data_in_the_amount_field() {
        transferPage.amount.sendKeys("100");
    }

    @When("the user selects data from the From Account dropdown")
    public void the_user_selects_data_from_the_from_account_dropdown() {
        Select fromAccount = new Select(transferPage.fromAccountDropdown);
        fromAccount.selectByValue("14121");
    }

    @When("the user selects data from the To Account dropdown")
    public void the_user_selects_data_from_the_to_account_dropdown() {
        Select toAccount = new Select(transferPage.toAccountDropdown);
        toAccount.selectByValue("14343");
    }

    @When("the user clicks on the {string} button transfer")
    public void the_user_clicks_on_the_button_transfer(String buttonText) {
        if (buttonText.equalsIgnoreCase("Transfer")) {
            transferPage.transferButton.click();
        }
    }

    @Then("the user should see the transfer success title displayed")
    public void the_user_should_see_the_transfer_success_title_displayed() {
        Assert.assertTrue(
                "Transfer success title is not displayed",
                transferPage.transferSuccessTitle.isDisplayed()
        );
    }
}
