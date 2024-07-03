package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    private By searchNameField = By.name("customerName");
    private By selectAllCheckbox = By.className("select-all-none");
    private By deleteButton = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a/span");
    private By confirmDeleteButton = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]");
    private By successMessage = By.xpath("/html/body/div[3]/span[3]/p");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchCustomer(String customerName) {
        driver.findElement(searchNameField).click();
        driver.findElement(searchNameField).sendKeys(customerName);
    }

    public void selectAll() {
        driver.findElement(selectAllCheckbox).click();
    }

    public void clickDelete() {
        driver.findElement(deleteButton).click();
    }

    public void confirmDelete() {
        driver.findElement(confirmDeleteButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
