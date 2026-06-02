package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class Checkbox {

    private final WebDriver driver;
    private final String label;

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void check(boolean checked){
        log.info("Установка чекбокса '{}' в состояние: '{}'", label, checked);
        WebElement checkboxElement =driver.findElement((By.xpath(String.format("//*[contains(text(), '%s')]/parent::div//input", label))));
        if (checkboxElement.isSelected() != checked) {
            checkboxElement.click();
        }
    }
}