package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountsPage;
import pages.LoginPage;

public class NewAccountDetailsSteps {

    WebDriver driver;
    LoginPage loginPage;
    AccountsPage accountsPage;

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\Chrome_Driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginPage = new LoginPage(driver);
        accountsPage = new AccountsPage(driver);
        loginPage.login();
    }

    @When("the user clicks on the account number")
    public void the_user_clicks_on_the_account_number() {
        accountsPage.clickFirstAccount();
    }

    @Then("the user should see the account type displayed")
    public void the_user_should_see_the_account_type_displayed() {
        Assert.assertTrue("Account type is not displayed", accountsPage.accountType.isDisplayed());
    }

    @Then("the user should see the balance displayed")
    public void the_user_should_see_the_balance_displayed() {
        Assert.assertTrue("Balance is not displayed", accountsPage.balance.isDisplayed());
    }

    @Then("the user should see the available balance displayed")
    public void the_user_should_see_the_available_balance_displayed() {
        Assert.assertTrue("Available balance is not displayed", accountsPage.availableBalance.isDisplayed());
    }
}

