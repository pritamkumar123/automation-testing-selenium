package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    protected static WebDriver driver;  // <-- make static so it's shared

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\Chrome_Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterMethod
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // ✅ Add this so step defs can access driver
    public static WebDriver getDriver() {
        return driver;
    }
}
