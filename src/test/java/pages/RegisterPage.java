
package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RegisterPage extends BasePage {

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    /// /
    public void clickRegister() {
        registerLink.click();
    }

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement streetAddress;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//p[normalize-space()='Your account was created successfully. You are now logged in.']")
    public WebElement successMessage;

    @FindBy(linkText = "Log Out")
    public WebElement logoutLink;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register() {
        registerLink.click();
        firstName.sendKeys("Test");
        lastName.sendKeys("Test");
        streetAddress.sendKeys("Test");
        city.sendKeys("Test");
        state.sendKeys("Test");
        zipCode.sendKeys("Test");
        phoneNumber.sendKeys("Test");
        ssn.sendKeys("Test");
        username.sendKeys("Testuser1048");
        password.sendKeys("Testuser1048");
        confirmPassword.sendKeys("Testuser1048");
        registerButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(successMessage.isDisplayed());
        System.out.println(driver.getTitle());
        logoutLink.click();
    }
}
