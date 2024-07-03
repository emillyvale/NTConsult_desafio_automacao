package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    private WebDriver driver;
    private By successMessage = By.id("report-success");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessMessage() {
        WebElement messageElement = driver.findElement(successMessage);
        return messageElement.getText();
    }
}
