package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By switchVersionSelect = By.id("switch-version-select");
    private By bootstrapV4Option = By.xpath("//*[@id=\"switch-version-select\"]/option[2]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToBootstrapV4() {
        driver.findElement(switchVersionSelect).click();
        driver.findElement(bootstrapV4Option).click();
    }
}
