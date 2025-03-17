package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

   // Locators
    private final By usernameField = By.cssSelector("[data-test='username']");
    private final By passwordField = By.cssSelector("[data-test='password']");
    private final By loginButton = By.cssSelector("[data-test='login-button']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    // Optional: Method to check if an error message is displayed
    public boolean isErrorMessageDisplayed() {
        By errorMessage = By.cssSelector("[data-test='error-button']");
        return driver.findElement(errorMessage).isDisplayed();
    }
}
