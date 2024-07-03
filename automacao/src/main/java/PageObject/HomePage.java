package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By addCustomerButton = By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddCustomer() {
        driver.findElement(addCustomerButton).click();
    }
}
