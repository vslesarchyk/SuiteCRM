package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



@Log4j2
public class LoginPage extends BasePage {

    @FindBy(id = "user_name")
    WebElement userField;
    @FindBy(id = "username_password")
    WebElement passwordField;
    @FindBy(css = "[title='Log In']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage open() {
        log.info("Opening Login Page");
        driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOf(loginButton));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Page isn't opened");
        }
        return this;
    }

    public MainPage login(String user, String password) {
        log.info("Log in with credentials: '{}', '{}'", user, password);
        userField.sendKeys(user);
        passwordField.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }
}
