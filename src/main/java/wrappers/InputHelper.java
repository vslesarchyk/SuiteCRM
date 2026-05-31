package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputHelper {

    public static void write(WebDriver driver, String label, String text) {
        driver.findElement(By.xpath(String.format("//div[contains(text(), '%s')]/parent::div//input", label))).sendKeys(text);
    }
}
