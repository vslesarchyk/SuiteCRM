package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void write(String label, String text) {
        driver.findElement(By.xpath(String.format("//div[contains(text(), '%s')]/parent::div//input", label))).sendKeys(text);
    }

    public abstract BasePage isPageOpened();
}
