package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BillPaymentPage extends BasePage{
    @FindBy(linkText = "Bill Pay")
    public WebElement billPayLink;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement payeeStreet;

    @FindBy(name = "payee.address.city")
    public WebElement payeeCity;

    @FindBy(name = "payee.address.state")
    public WebElement payeeState;

    @FindBy(name = "payee.address.zipCode")
    public WebElement payeeZipCode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement payeePhone;

    @FindBy(name = "payee.accountNumber")
    public WebElement payeeAccountNumber;

    @FindBy(name = "verifyAccount")
    public WebElement verifyAccount;

    @FindBy(name = "amount")
    public WebElement amount;

    @FindBy(name = "fromAccountId")
    public WebElement fromAccountDropdown;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymentButton;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement paymentSuccessTitle;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewLink;

    public BillPaymentPage(WebDriver driver) {
        super(driver);
    }

    public void billpayment() {
        billPayLink.click();
        payeeName.sendKeys("Test");
        payeeStreet.sendKeys("Test");
        payeeCity.sendKeys("Test");
        payeeState.sendKeys("Test");
        payeeZipCode.sendKeys("Test");
        payeePhone.sendKeys("Test");
        payeeAccountNumber.sendKeys("13677");
        verifyAccount.sendKeys("13677");
        amount.sendKeys("100");
        Select selectAccount1 = new Select(fromAccountDropdown);
        selectAccount1.selectByValue("13899");
        sendPaymentButton.click();
        Assert.assertTrue(paymentSuccessTitle.isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        accountsOverviewLink.click();
    }
}
