package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailPage extends BasePage{
    public DetailPage(WebDriver driver) {
        super(driver);
    }

    @Step("Страница DetailPage открыта")
    @Override
    public DetailPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='module-title-text']")));
        return this;
    }

    public String getAccountName() {
        return driver.findElement(By.xpath("//h2[@class='module-title-text']")).getText();
    }
}
