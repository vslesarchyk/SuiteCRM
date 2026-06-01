package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputAddress {
    WebDriver driver;
    String labelAddress;
    String label;

    public InputAddress(WebDriver driver, String labelAddress, String label) {
        this.driver = driver;
        this.labelAddress = labelAddress;
        this.label = label;
    }

    public void writeAddress(String text) {
        driver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]//ancestor::div[contains(@class, 'edit-view-field')]//label[contains(text(), '%s')]//ancestor::tr//input", labelAddress, label))).sendKeys(text);
    }
}
