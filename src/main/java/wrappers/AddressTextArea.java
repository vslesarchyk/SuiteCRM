package wrappers;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AddressTextArea {

    WebDriver driver;
    String labelAddress;
    String label;

    public AddressTextArea(WebDriver driver, String labelAddress, String label) {
        this.driver = driver;
        this.labelAddress = labelAddress;
        this.label = label;
    }

    public void write(String text) {
        log.info("Entering text '{}' into block {} field '{}'", text, labelAddress, label);
        driver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]//ancestor::div[contains(@class, 'edit-view-field')]//label[contains(text(), '%s')]//ancestor::tr//textarea", labelAddress, label))).sendKeys(text);
    }
}
