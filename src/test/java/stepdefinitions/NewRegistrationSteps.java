package stepdefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegisterPage;

import java.time.Duration;

public class NewRegistrationSteps {

        WebDriver driver;
        RegisterPage registerPage = new RegisterPage(driver);

        @Given("the user is on the homepage")
        public void the_user_is_on_the_homepage() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\Chrome_Driver\\chromedriver.exe");
            this.driver = new ChromeDriver();
            this.driver.manage().window().maximize();
            this.driver.get("https://parabank.parasoft.com/parabank/index.htm");

            // ✅ Initialize page object here
            registerPage = new RegisterPage(driver);
        }

        @When("the user clicks on the {string} link")
        public void the_user_clicks_on_the_link(String register) {
            if (register.equalsIgnoreCase("Register")) {
                registerPage.registerLink.click();
            } else if (register.equalsIgnoreCase("Log Out")) {
                registerPage.logoutLink.click();
            }
        }

        @When("the user enters data in the First Name field")
        public void the_user_enters_data_in_the_first_name_field() {
            registerPage.firstName.sendKeys("Test");
        }

        @When("the user enters data in the Last Name field")
        public void the_user_enters_data_in_the_last_name_field() {
            registerPage.lastName.sendKeys("Test");
        }

        @When("the user enters data in the Street Address field")
        public void the_user_enters_data_in_the_street_address_field() {
            registerPage.streetAddress.sendKeys("Test");
        }

        @When("the user enters data in the City field")
        public void the_user_enters_data_in_the_city_field() {
            registerPage.city.sendKeys("Test");
        }

        @When("the user enters data in the State field")
        public void the_user_enters_data_in_the_state_field() {
            registerPage.state.sendKeys("Test");
        }

        @When("the user enters data in the Zip Code field")
        public void the_user_enters_data_in_the_zip_code_field() {
            registerPage.zipCode.sendKeys("Test");
        }

        @When("the user enters data in the Phone Number field")
        public void the_user_enters_data_in_the_phone_number_field() {
            registerPage.phoneNumber.sendKeys("Test");
        }

        @When("the user enters data in the SSN field")
        public void the_user_enters_data_in_the_ssn_field() {
            registerPage.ssn.sendKeys("Test");
        }

        @When("the user enters data in the Username field")
        public void the_user_enters_data_in_the_username_field() {
            //String uniqueUsername = "TestUser" + System.currentTimeMillis();
            registerPage.username.sendKeys("Testuser1048");
        }

        @When("the user enters data in the Password field")
        public void the_user_enters_data_in_the_password_field() {

            registerPage.password.sendKeys("Testuser1048");
        }

        @When("the user enters data in the Confirm Password field")
        public void the_user_enters_data_in_the_confirm_password_field() {
            registerPage.confirmPassword.sendKeys("Testuser1048");
        }

        @When("the user clicks on the {string} button")
        public void the_user_clicks_on_the_button(String buttonName) {
            if (buttonName.equalsIgnoreCase("Register")) {
                registerPage.registerButton.click();
                //registerPage.clickRegister();
            }
        }

        @Then("the user should see a success message {string}")
        public void the_user_should_see_a_success_message(String expectedMessage) {
            String actualMessage = registerPage.successMessage.getText().trim();
            Assert.assertEquals(expectedMessage, actualMessage);
        }


 /*
    @Then("the user should see a success message {string}")
    public void the_user_should_see_a_success_message(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement messageElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(text(),'Your account was created successfully')]")
                )
        );

        String actualMessage = messageElement.getText().trim();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
*/






}

