package blackmesa.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add assertions to verify successful login
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        // Verify the current URL
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void testInvalidLogin() {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid-username", "invalid-password");

        // Add assertions to verify login failure
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message should be displayed for invalid login");
    }
}