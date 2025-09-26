
package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

public class NewLoginSteps {

    WebDriver driver;
    LoginPage loginPage;


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\Chrome_Driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters username")
    public void the_user_enters_username() {
        loginPage.usernameInput.sendKeys("Testuser1048");

    }

    @When("the user enters password")
    public void the_user_enters_password() {

        loginPage.passwordInput.sendKeys("Testuser1048");
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the user should be redirected to the {string} page")
    public void the_user_should_be_redirected_to_the_page(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.accountsOverviewTitle));

        boolean isDisplayed = loginPage.accountsOverviewTitle.isDisplayed();
        org.junit.Assert.assertTrue("Expected page title not displayed", isDisplayed);
    }
}

