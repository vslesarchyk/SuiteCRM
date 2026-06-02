package steps;

import dto.Account;
import org.openqa.selenium.WebDriver;
import pages.DetailPage;
import pages.NewAccountPage;

public class AccountStep {

    WebDriver driver;
    NewAccountPage newAccountPage;

    public AccountStep(WebDriver driver) {
        this.driver = driver;
        newAccountPage = new NewAccountPage(driver);
    }

    public DetailPage createAccount(Account account) {
       return newAccountPage.open()
                .isPageOpened()
                .createAccount(account)
                .saveNewAccount()
                .isPageOpened();
           }
}
