package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
    }

    @Step("Страница MainPage открыта")
    @Override
    public MainPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Welcome to the SuiteCRM 7 Demo']")));
        return this;
    }
}
