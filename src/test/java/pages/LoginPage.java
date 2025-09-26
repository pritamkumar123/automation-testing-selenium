
package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[normalize-space()='Accounts Overview']")
    public WebElement accountsOverviewTitle;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        usernameInput.sendKeys("Testuser1048");
        passwordInput.sendKeys("Testuser1048");
        loginButton.click();
        System.out.println(driver.getTitle());
        Assert.assertTrue(accountsOverviewTitle.isDisplayed());
    }
}
