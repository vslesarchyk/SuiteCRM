package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.*;

public class NewAccountPage extends BasePage {

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage open() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module=Accounts&return_action=DetailView");
        return this;
    }

    @Override
    public NewAccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//div[@id='EditView_tabs']/following-sibling::div[@class='buttons']/input[@title='Save']")));
        return this;
    }

    public NewAccountPage createAccount(Account account) {
        new Input(driver, "Name").write (account.getName());
        new Input(driver, "Fax").write (account.getFax());
        new Input(driver, "Office Phone").write (account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new EmailInput(driver, "Email Address").write(account.getEmail_address());
        new Checkbox(driver, "Opted Out").check(account.isOptedOut());
        new AddressTextArea(driver, "Billing Address", "Street").write(account.getStreet1());
        new InputAddress(driver, "Billing Address", "City").writeAddress(account.getCity1());
        new InputAddress(driver, "Billing Address", "State/Region").writeAddress(account.getState1());
        new InputAddress(driver, "Billing Address", "Postal Code").writeAddress(account.getPostal_code1());
        new InputAddress(driver, "Billing Address", "Country").writeAddress(account.getCountry2());
        new AddressTextArea(driver, "Shipping Address", "Street").write(account.getStreet2());
        new InputAddress(driver, "Shipping Address", "City").writeAddress(account.getCity2());
        new InputAddress(driver, "Shipping Address", "State/Region").writeAddress(account.getState2());
        new InputAddress(driver, "Shipping Address", "Postal Code").writeAddress(account.getPostal_code2());
        new InputAddress(driver, "Shipping Address", "Country").writeAddress(account.getCountry2());
        new TextArea(driver, "Description").write(account.getDescription());
        new Select(driver, "Type").select(account.getType());
        new Select(driver, "Industry").select(account.getIndustry());
        return this;
    }

    public void saveNewAccount() {
        driver.findElement(By.xpath
                        ("//div[@id='EditView_tabs']/following-sibling::div[@class='buttons']/input[@title='Save']"))
                .click();
    }
}
