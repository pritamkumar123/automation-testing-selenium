//package stepdefinitions;
//
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import pages.LoanPage;
//import pages.LoginPage;
//
//        public class NewLoanSteps {
//
//            WebDriver driver;
//            LoginPage loginPage;
//            LoanPage loanPage;
//
//            @Given("the user is logged in loan")
//            public void the_user_is_logged_in_loan() {
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Downloads\\chromedriver.exe");
//                this.driver = new ChromeDriver();
//                this.driver.manage().window().maximize();
//                this.driver.get("https://parabank.parasoft.com/parabank/index.htm");
//
//                loginPage = new LoginPage(driver);
//                loanPage = new LoanPage(driver);
//                loginPage.login();
//            }
//
//            @When("the user is on the loan request page")
//            public void the_user_is_on_the_loan_request_page() {
//
//                loanPage.goToLoanRequestPage();
//            }
//
//            @When("the user enters loan amount")
//            public void the_user_enters_loan_amount() {
//                loanPage.loanAmount.clear();
//                loanPage.loanAmount.sendKeys("1000");
//            }
//
//            @When("the user enters down payment")
//            public void the_user_enters_down_payment() {
//                loanPage.downPayment.clear();
//                loanPage.downPayment.sendKeys("100");
//            }
//
//            @When("the user selects account number from the dropdown")
//            public void the_user_selects_account_number_from_the_dropdown() {
//                Select select = new Select(loanPage.fromAccountDropdown);
//                select.selectByValue("13899");
//            }
//
//            @When("the user clicks on the apply now button")
//            public void the_user_clicks_on_the_apply_now_button() {
//                loanPage.applyNowButton.click();
//            }
//
//            @Then("the loan should be approved successfully")
//            public void the_loan_should_be_approved_successfully() {
//                Assert.assertTrue("Loan success message not displayed", loanPage.loanSuccessTitle.isDisplayed());
//            }
//
//            @Then("the user should be redirected to the accounts overview page")
//            public void the_user_should_be_redirected_to_the_accounts_overview_page() {
//                loanPage.accountsOverviewLink.click();
//                Assert.assertTrue(loanPage.accountsOverviewLink.isDisplayed());
//            }
//        }
package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.LoanPage;
import pages.LoginPage;

public class NewLoanSteps {

    // 🔹 Make them static so they are shared across step objects
    static WebDriver driver;
    static LoginPage loginPage;
    static LoanPage loanPage;

    @Given("the user is logged in loan")
    public void the_user_is_logged_in_loan() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\Chrome_Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // initialize pages once
        loginPage = new LoginPage(driver);
        loanPage = new LoanPage(driver);

        // perform login
        loginPage.login();
    }

    @When("the user is on the loan request page")
    public void the_user_is_on_the_loan_request_page() {
        loanPage.goToLoanRequestPage();
    }

    @When("the user enters loan amount")
    public void the_user_enters_loan_amount() {
        loanPage.loanAmount.clear();
        loanPage.loanAmount.sendKeys("1000");
    }

    @When("the user enters down payment")
    public void the_user_enters_down_payment() {
        loanPage.downPayment.clear();
        loanPage.downPayment.sendKeys("100");
    }

    @When("the user selects account number from the dropdown")
    public void the_user_selects_account_number_from_the_dropdown() {
        Select select = new Select(loanPage.fromAccountDropdown);
        select.selectByValue("13899");
    }

    @When("the user clicks on the apply now button")
    public void the_user_clicks_on_the_apply_now_button() {
        loanPage.applyNowButton.click();
    }

    @Then("the loan should be approved successfully")
    public void the_loan_should_be_approved_successfully() {
        Assert.assertTrue("Loan success message not displayed", loanPage.loanSuccessTitle.isDisplayed());
    }

    @Then("the user should be redirected to the accounts overview page")
    public void the_user_should_be_redirected_to_the_accounts_overview_page() {
        loanPage.accountsOverviewLink.click();
        Assert.assertTrue(loanPage.accountsOverviewLink.isDisplayed());
    }
}
