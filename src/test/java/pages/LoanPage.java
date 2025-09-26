
package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoanPage extends BasePage {

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanLink;
    @FindBy(id = "amount")
    public WebElement loanAmount;
    @FindBy(id = "downPayment")
    public WebElement downPayment;
    @FindBy(id = "fromAccountId")
    public WebElement fromAccountDropdown;
    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement loanSuccessTitle;
    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewLink;

    public LoanPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoanRequestPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(requestLoanLink))
                .click();
    }


    public void loan() {
        requestLoanLink.click();
        loanAmount.sendKeys("1000");
        downPayment.sendKeys("100");
        Select selectAccount = new Select(fromAccountDropdown);
        selectAccount.selectByValue("13899");
        applyNowButton.click();
        Assert.assertTrue(loanSuccessTitle.isDisplayed());
        accountsOverviewLink.click();
    }
}
