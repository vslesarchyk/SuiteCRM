package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class EmailInput {
    private final WebDriver driver;
    private final String label;

    public EmailInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String email) {
        log.info("Entering text '{}' into field '{}'", email, label);
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//input[contains(@id,'Accounts0emailAddress')]", label))));
        element.clear();
        element.sendKeys(email);
    }
}
