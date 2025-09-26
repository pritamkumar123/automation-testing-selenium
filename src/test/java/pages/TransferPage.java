
package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferPage extends BasePage {

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFundsLink;

    @FindBy(id = "amount")
    public WebElement amount;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountDropdown;

    @FindBy(id = "toAccountId")
    public WebElement toAccountDropdown;

    @FindBy(xpath = "//input[@value='Transfer']")
    public WebElement transferButton;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement transferSuccessTitle;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewLink;

    public TransferPage(WebDriver driver) {
        super(driver);
    }

    public void transfer() {
        transferFundsLink.click();
        amount.sendKeys("100");
        Select selectFromAccount = new Select(fromAccountDropdown);
        selectFromAccount.selectByValue("14121");
        Select selectToAccount = new Select(toAccountDropdown);
        selectToAccount.selectByValue("14343");
        transferButton.click();
        Assert.assertTrue(transferSuccessTitle.isDisplayed());
        accountsOverviewLink.click();
    }
}
