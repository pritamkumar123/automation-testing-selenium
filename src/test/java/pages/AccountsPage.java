package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountsPage extends BasePage{
//    @FindBy(linkText ="20559")
    @FindBy(xpath = "(//a[contains(@href,'activity.htm?id=')])[1]")
    public WebElement accountNumber;
    @FindBy(id ="accountType" )
    public WebElement accountType;
    @FindBy(id = "balance")
    public WebElement balance;
    @FindBy(id = "availableBalance")
    public WebElement availableBalance;
    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement account = wait.until(ExpectedConditions.elementToBeClickable(accountNumber));
        account.click();
    }

    public void accounts() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        accountNumber.click();
        Assert.assertTrue(accountType.isDisplayed());
        Assert.assertTrue(balance.isDisplayed());
        Assert.assertTrue(availableBalance.isDisplayed());
    }
}
