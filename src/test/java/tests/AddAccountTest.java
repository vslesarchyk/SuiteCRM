package tests;

import dto.Account;
import org.testng.annotations.Test;
import pages.DetailPage;
import static dto.AccountFactory.getAccount;
import static org.testng.Assert.assertEquals;


public class AddAccountTest extends BaseTest {
    Account account = getAccount(
            "Integrator",
            "Energy"
    );

    Account account1 = Account.builder()
            .name("test")
            .fax("+375291234567")
            .optedOut(false)
            .build();

    @Test
    public void checkAddAccount() {
        loginStep.auth("will", "will");
        DetailPage detailPage = accountStep.createAccount(account1);
        String actualAccountName = detailPage.isPageOpened().getAccountName();
        assertEquals(actualAccountName, account1.getName(), "Account name doesn't match");
    }
}
