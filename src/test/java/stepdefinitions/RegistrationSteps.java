package stepdefinitions;


import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegistrationSteps extends BaseTest {

    @Test
    public void registrationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();
    }
}